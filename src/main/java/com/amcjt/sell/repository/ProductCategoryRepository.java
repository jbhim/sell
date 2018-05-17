package com.amcjt.sell.repository;

import com.amcjt.sell.domain.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author Administrator
 */
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Integer>{

    /**
     * @param categoryTypeList
     * @return List<ProductCategory>
     */
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
