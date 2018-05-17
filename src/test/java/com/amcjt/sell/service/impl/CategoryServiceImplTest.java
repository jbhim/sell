package com.amcjt.sell.service.impl;

import com.amcjt.sell.domain.ProductCategory;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CategoryServiceImplTest {
    @Autowired
    private CategoryServiceImpl service;
    @Test
    public void findOne() throws Exception {
        ProductCategory one = service.findOne(1);
        Assert.assertEquals(new Integer(1),one.getCategoryId());
    }

    @Test
    public void findAll() throws Exception {
        List<ProductCategory> all = service.findAll();
        Assert.assertNotEquals(0,all.size());
    }

    @Test
    public void findByCategoryTypeIn() throws Exception {
        List<ProductCategory> byCategoryTypeIn = service.findByCategoryTypeIn(Arrays.asList(2, 3, 4));
        Assert.assertNotEquals(0,byCategoryTypeIn.size());
    }

    @Test
    public void save() throws Exception {
        ProductCategory productCategory = new ProductCategory("秀吉专享", 5);
        ProductCategory save = service.save(productCategory);
        Assert.assertNotNull(save);
    }

}