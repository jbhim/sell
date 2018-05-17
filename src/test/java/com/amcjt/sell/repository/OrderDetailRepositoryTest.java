package com.amcjt.sell.repository;

import com.amcjt.sell.domain.OrderDetail;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderDetailRepositoryTest {
    @Autowired
    private OrderDetailRepository repository;
    @Test
    public void save() throws Exception {
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setDetailId("12345678");
        orderDetail.setOrderId("11111111");
        orderDetail.setProductIcon("http://sdssd.jpg");
        orderDetail.setProductId("231232");
        orderDetail.setProductName("三杯鸡");
        orderDetail.setProductPrice(new BigDecimal(12.9));
        orderDetail.setProductQuantity(2);
        OrderDetail save = repository.save(orderDetail);
        Assert.assertNotNull(save);
    }
    @Test
    public void findByOrderId() throws Exception {
        List<OrderDetail> byOrderId = repository.findByOrderId("11111111");
        Assert.assertNotEquals(0, byOrderId.size());
    }

}