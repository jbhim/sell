package com.amcjt.sell.domain;

import com.amcjt.sell.enums.ProductStatusEnum;
import com.amcjt.sell.utils.EnumUtil;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 商品
 * @author Administrator
 */
@Entity
@Data
public class ProductInfo {
    @Id
    private String productId;
    /**名字*/
    private String productName;
    /**单价*/
    private BigDecimal productPrice;
    /**库存*/
    private Integer productStock;
    /**描述*/
    private String productDescription;
    /**商品状态0正常1下架*/
    private Integer productStatus = ProductStatusEnum.UP.getCode();
    /**小图*/
    private String productIcon;
    /**类目编号*/
    private Integer categoryType;
    /**创建时间*/
    private Date createTime;
    /**更新时间*/
    private Date updateTime;
    @JsonIgnore
    public ProductStatusEnum getProductStatusEnum() {
        return EnumUtil.getByCode(productStatus, ProductStatusEnum.class);
    }

}
/**
 * CREATE TABLE `product_info` (
 `product_id` VARCHAR(32) NOT NULL,
 `product_name` VARCHAR(64) NOT NULL COMMENT '商品名称',
 `product_price` DECIMAL(8,2) NOT NULL COMMENT '单价',
 `product_stock` INT not NULL COMMENT '库存',
 `product_description` VARCHAR(64) COMMENT '描述',
 `product_status` int NOT NULL default '0' COMMENT '商品状态0正常1下架',
 `product_icon` VARCHAR(512) COMMENT '小图',
 `category_type` INT NOT NULL COMMENT '类目编号',
 `create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
 `update_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT'更新时间',
 PRIMARY KEY (`product_id`)
 ) comment '商品表';
 *
 */
