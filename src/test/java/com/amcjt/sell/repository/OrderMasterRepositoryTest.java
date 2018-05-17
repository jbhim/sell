package com.amcjt.sell.repository;

import com.amcjt.sell.domain.OrderMaster;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderMasterRepositoryTest {
    @Autowired
    private OrderMasterRepository repository;
    private final String OPENID = "110110";
    @Test
    public void saveTest(){
        OrderMaster orderMaster = new OrderMaster();
        orderMaster.setOrderId("1234567");
        orderMaster.setBuyerName("华硕");
        orderMaster.setBuyerPhone("13456541139");
        orderMaster.setBuyerAddress("江西鸡冠山");
        orderMaster.setBuyerOpenid(OPENID);
        orderMaster.setOrderAmount(new BigDecimal(127.99));
        OrderMaster save = repository.save(orderMaster);
        Assert.assertNotNull(save);
    }
    @Test
    public void findByBuyerOpenid() throws Exception {
        PageRequest pageable = new PageRequest(0,2);
        Page<OrderMaster> byBuyerOpenid = repository.findByBuyerOpenid(OPENID, pageable);
        Assert.assertNotEquals(0, byBuyerOpenid.getTotalElements());
    }

}