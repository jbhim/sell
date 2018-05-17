package com.amcjt.sell.service;

import com.amcjt.sell.domain.ProductCategory;

import java.util.List;

/**
 * @author Administrator
 */
public interface CategoryService {
    /**
     * @param categoryId
     * @return ProductCategory
     */
    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);

}
