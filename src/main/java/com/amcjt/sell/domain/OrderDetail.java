package com.amcjt.sell.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * @author Administrator
 */
@Entity
@Data
public class OrderDetail {
    @Id
    private String detailId;
    /**订单id*/
    private String orderId;
    /**商品id*/
    private String productId;
    /**商品名称*/
    private String productName;
    /**单价*/
    private BigDecimal productPrice;
    /**商品名称*/
    private Integer productQuantity;
    /**小图*/
    private String productIcon;
    /**创建时间*/
    //private Date createTime;
    /**更新时间*/
    //private Date updateTime;
}

/*CREATE TABLE `order_detail` (
    `detail_id` VARCHAR(32) not NULL,
    `order_id` VARCHAR(32) not NULL,
    `product_id` VARCHAR(32) NOT NULL,
    `product_name` VARCHAR(64) NOT NULL COMMENT '商品名称',
    `product_price` DECIMAL(8,2) NOT NULL COMMENT '单价',
    `product_quantity` int not NULL COMMENT '商品数量',
    `product_icon` VARCHAR(512) COMMENT '小图',
    `create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `update_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`detail_id`),
    key `idx_order_id` (`order_id`)

)comment '订单详情表';*/
