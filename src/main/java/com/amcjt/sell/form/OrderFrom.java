package com.amcjt.sell.form;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

/**
 * @author jbhim
 * @date 2018/5/5/005.
 */
@Data
public class OrderFrom {
    /**
     * 买家姓名
     */
    @NotEmpty(message = "姓名必填")
    private String name;
    /**
     * 买家手机
     */
    @NotEmpty(message = "手机号必填")
    private String phone;
    /**
     * 买家地址
     */
    @NotEmpty(message = "地址必填")
    private String address;
    /**
     * 买家微信openid
     */
    @NotEmpty(message = "openid必填")
    private String openid;
    /**
     * 购物车
     */
    @NotEmpty(message = "购物车不能为空")
    private String items;

}
