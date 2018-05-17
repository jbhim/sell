package com.amcjt.sell.domain;

import com.amcjt.sell.enums.OrderStatusEnum;
import com.amcjt.sell.enums.PayStatusEnum;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.validator.constraints.Range;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @author Administrator
 */
@Entity
@Data
@DynamicUpdate
public class OrderMaster {
    @Id
    private String orderId;
    /**买家姓名*/
    private String buyerName;
    /**买家电话*/
    private String buyerPhone;
    /**买家地址*/
    private String buyerAddress;
    /**买家微信openid*/
    private String buyerOpenid;
    /**订单总金额*/
    private BigDecimal orderAmount;
    /**订单状态,默认0是下单*/
    private Integer orderStatus = OrderStatusEnum.NEW.getCode();
    /**支付状态,默认0是未支付*/
    private Integer payStatus = PayStatusEnum.WAIT.getCode();
    /**创建时间*/
    private Date createTime;
    /**更新时间*/
    private Date updateTime;

}
/*
CREATE TABLE `order_master` (
    `order_id` VARCHAR(32) not NULL,
    `buyer_name` VARCHAR(32) not NULL COMMENT '买家姓名',
    `buyer_phone` VARCHAR(32) not NULL COMMENT '买家电话',
    `buyer_address` VARCHAR(128) not NULL COMMENT '买家地址',
    `buyer_openid` VARCHAR(64) not NULL COMMENT '买家微信openid',
    `order_amount` DECIMAL(8,2) not NULL COMMENT '订单总金额',
    `order_status` tinyint(3) not NULL default '0' COMMENT '订单状态,默认0是下单',
    `pay_status` tinyint(3) not NULL default '0' COMMENT '支付状态,默认0是未支付',
    `create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `update_tim` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`order_id`),
    key `idx_buyer_openid` (`buyer_openid`)
)comment '订单表';
*/
