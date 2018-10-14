package com.amcjt.sell.service.impl;

import com.amcjt.sell.domain.OrderDetail;
import com.amcjt.sell.dto.OrderDTO;
import com.amcjt.sell.enums.OrderStatusEnum;
import com.amcjt.sell.enums.PayStatusEnum;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author jbhim
 * @date 2018/6/14/004.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class OrderServiceImplTest {
    @Autowired
    private OrderServiceImpl orderService;
    private final String OPEN_ID = "110110";
    private final String ORDER_ID = "1525424879286253841";
    @Test
    public void create() throws Exception {
        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setBuyerAddress("杭州下沙宝龙");
        orderDTO.setBuyerName("jbhim");
        orderDTO.setBuyerOpenid(OPEN_ID);
        orderDTO.setBuyerPhone("13456541139");

        //购物车
        List<OrderDetail> orderDetails = new ArrayList<>();
        OrderDetail o1 = new OrderDetail();
        o1.setProductId("12345");
        o1.setProductQuantity(3);

        OrderDetail o2 = new OrderDetail();
        o2.setProductId("11111");
        o2.setProductQuantity(7);
        //放入list
        orderDetails.add(o1);
        orderDetails.add(o2);
        orderDTO.setOrderDetailList(orderDetails);
        OrderDTO result = orderService.create(orderDTO);
        log.info("【创建订单】result={}",result);
        Assert.assertNotNull(result);
    }

    @Test
    public void findOne() throws Exception {
        OrderDTO result = orderService.findOne(ORDER_ID);
        log.info("【查询单个订单】result{}", result);
        Assert.assertEquals(ORDER_ID, result.getOrderId());
    }

    @Test
    public void findList() throws Exception {
        Pageable pageable = new PageRequest(0,2);
        Page<OrderDTO> list = orderService.findList(OPEN_ID, pageable);
        Assert.assertNotEquals(0, list.getTotalElements());
    }

    @Test
    public void cancel() throws Exception {
        OrderDTO orderDTO = orderService.findOne(ORDER_ID);
        OrderDTO result = orderService.cancel(orderDTO);
        Assert.assertEquals(OrderStatusEnum.CANCEL.getCode(), result.getOrderStatus());

    }

    @Test
    public void finish() throws Exception {
        OrderDTO orderDTO = orderService.findOne(ORDER_ID);
        OrderDTO result = orderService.finish(orderDTO);
        Assert.assertEquals(OrderStatusEnum.FINISHED.getCode(), result.getOrderStatus());
    }

    @Test
    public void paid() throws Exception {
        OrderDTO orderDTO = orderService.findOne(ORDER_ID);
        OrderDTO result = orderService.paid(orderDTO);
        Assert.assertEquals(PayStatusEnum.SUCCESS.getCode(), result.getPayStatus());
    }

    @Test
    public void list() {
        PageRequest request = PageRequest.of(0, 2);
        Page<OrderDTO> list = orderService.findList(request);
        Assert.assertNotEquals(0, list.getTotalElements());
    }

}