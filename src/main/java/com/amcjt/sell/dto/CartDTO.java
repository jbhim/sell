package com.amcjt.sell.dto;

import lombok.Data;

/**
 * @author jbhim
 * @date 2018/6/14/004.
 */
@Data
public class CartDTO {
    /**商品id*/
    private String productId;
    /**数量*/
    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
