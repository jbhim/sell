package com.amcjt.sell.repository;

import com.amcjt.sell.domain.ProductInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author Administrator
 */
public interface ProductInfoRepository extends JpaRepository<ProductInfo, String>{
    /**
     * 根据商品状态查商品
     * @param ProductStatus
     * @return List<ProductInfo>
     */
    List<ProductInfo> findByProductStatus(Integer ProductStatus);


}
