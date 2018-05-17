package com.amcjt.sell.service.impl;

import com.amcjt.sell.domain.ProductInfo;
import com.amcjt.sell.enums.ProductStatusEnum;
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
import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceImplTest {
    @Autowired
    private ProductServiceImpl productService;
    @Test
    public void findOne() throws Exception {
        ProductInfo one = productService.findOne("12345");
        Assert.assertEquals("12345",one.getProductId());
    }

    @Test
    public void findUpAll() throws Exception {
        List<ProductInfo> upAll = productService.findUpAll();
        Assert.assertNotEquals(0, upAll.size());
    }

    @Test
    public void findAll() throws Exception {
        Pageable pageable = new PageRequest(0,2);
        Page<ProductInfo> all = productService.findAll(pageable);
        long totalElements = all.getTotalElements();
        System.out.println(totalElements);

    }

    @Test
    public void save() throws Exception {
        ProductInfo productInfo =new ProductInfo();
        productInfo.setProductId("11111");
        productInfo.setProductName("三杯鸡");
        productInfo.setProductPrice(new BigDecimal(29));
        productInfo.setProductStock(9);
        productInfo.setProductDescription("好吃的鸡");
        productInfo.setProductIcon("http://xxxx.jpg");
        productInfo.setProductStatus(0);
        productInfo.setCategoryType(2);
        ProductInfo save = productService.save(productInfo);
        Assert.assertNotNull(save);
    }

    @Test
    public void onSale () {
        ProductInfo result = productService.onSale("11111");
        Assert.assertEquals(ProductStatusEnum.UP.getCode(),result.getProductStatus());

    }
    @Test
    public void offSale () {
        ProductInfo result = productService.offSale("11111");
        Assert.assertEquals(ProductStatusEnum.DOWN.getCode(),result.getProductStatus());

    }

}