package com.amcjt.sell.controller;

import com.amcjt.sell.converter.OrderForm2OrderDTOConverter;
import com.amcjt.sell.dto.OrderDTO;
import com.amcjt.sell.enums.ResultEnum;
import com.amcjt.sell.exception.SellException;
import com.amcjt.sell.form.OrderFrom;
import com.amcjt.sell.service.BuyerService;
import com.amcjt.sell.service.OrderService;
import com.amcjt.sell.utils.ResultVOUtil;
import com.amcjt.sell.vo.ResultVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author jbhim
 * @date 2018/6/6/005.
 */
@CrossOrigin
@RestController
@RequestMapping("/buyer/order")
@Slf4j
public class BuyerOrderController {

    @Autowired
    private OrderService orderService;

    @Autowired
    private BuyerService buyerService;
    /**
     * 创建订单
     */
    @PostMapping("/create")
    public ResultVO<Map<String, String>> create(@Valid OrderFrom orderFrom,
                                                BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            log.error("【创建订单】 参数不正确, orderForm={}", orderFrom);
            throw new SellException(ResultEnum.PARAM_ERROR, bindingResult.getFieldError().getDefaultMessage());
        }
        OrderDTO orderDTO = OrderForm2OrderDTOConverter.convert(orderFrom);
        if (CollectionUtils.isEmpty(orderDTO.getOrderDetailList())) {
            log.error("【创建订单】购物车不能为空");
            throw new SellException(ResultEnum.CAR_EMPTY);
        }
        OrderDTO createResult = orderService.create(orderDTO);
        Map<String, String> map = new HashMap<>();
        map.put("orderId", createResult.getOrderId());

        return ResultVOUtil.success(map);
    }

    /**
     * 订单列表
     */
    @GetMapping("/list")
    public ResultVO<OrderDTO> list(@RequestParam("openid") String openid,
                                   @RequestParam(value = "page", defaultValue = "0") Integer page,
                                   @RequestParam(value = "size", defaultValue = "10") Integer size) {

        if (StringUtils.isEmpty(openid)) {
            log.error("【查询订单列表】openid为空");
            throw new SellException(ResultEnum.PARAM_ERROR);
        }
        Page<OrderDTO> orderDTOPage = orderService.findList(openid, PageRequest.of(page, size));
        List<OrderDTO> content = orderDTOPage.getContent();
        return ResultVOUtil.success(content);
    }

    /**
     * 订单详情
     */
    @GetMapping("detail")
    public ResultVO<OrderDTO> detail(@RequestParam("openid") String openid,
                                     @RequestParam("orderId") String orderId) {
        OrderDTO orderDTO = buyerService.findOrderOne(openid, orderId);
        return ResultVOUtil.success(orderDTO);
    }

    /**
     * 取消订单
     */
    @PostMapping("cancel")
    public ResultVO cancel(@RequestParam("openid") String openid,
                           @RequestParam("orderId") String orderId) {
        buyerService.cancel(openid, orderId);
        return ResultVOUtil.success();
    }

}
