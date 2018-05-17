package com.amcjt.sell.service.impl;

import com.amcjt.sell.dto.OrderDTO;
import com.amcjt.sell.service.PayService;
import com.lly835.bestpay.service.impl.BestPayServiceImpl;

/**
 * @author jbhim
 * @date 2018/5/7/007.
 */
public class PayServiceImpl implements PayService {
    @Override
    public void create(OrderDTO orderDTO) {

        BestPayServiceImpl bestPayService = new BestPayServiceImpl();
        //bestPayService.setWxPayH5Config();

    }
}
