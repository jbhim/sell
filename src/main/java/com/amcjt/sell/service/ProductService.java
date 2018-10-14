package com.amcjt.sell.service;

import com.amcjt.sell.domain.ProductInfo;
import com.amcjt.sell.dto.CartDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @author Administrator
 */
public interface ProductService {
    ProductInfo findOne(String productId);

    /**
     * 查询所有在架商品
     *
     * @return
     */

    List<ProductInfo> findUpAll();

    Page<ProductInfo> findAll(Pageable pageable);

    ProductInfo save(ProductInfo productInfo);


    /**
     * 加库存
     *
     * @param cartDTOS
     */
    void increaseStock(List<CartDTO> cartDTOS);

    /**
     * 减库存
     *
     * @param cartDTOS
     */
    void decreaseStock(List<CartDTO> cartDTOS);

    /**
     * 在架
     *
     * @param productId
     * @return
     */
    ProductInfo onSale(String productId);

    /**
     * 上架
     *
     * @param productId
     * @return
     */
    ProductInfo offSale(String productId);


}
