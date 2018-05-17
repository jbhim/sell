package com.amcjt.sell.service.impl;

import com.amcjt.sell.dto.OrderDTO;
import com.amcjt.sell.service.OrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @author jbhim
 * @date 2018/5/12/012.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PushMessageImplTest {

    @Autowired
    private PushMessageImpl pushMessage;

    @Autowired
    private OrderService service;
    @Test
    public void orderStatus() throws Exception {
        OrderDTO orderDTO = service.findOne("1525505285790309579");

        pushMessage.orderStatus(orderDTO);
    }

}