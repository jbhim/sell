package com.amcjt.sell.vo;

import lombok.Data;

/**
 * http请求返回的最外层对象
 * @author Administrator
 */
@Data
public class ResultVO<T> {
    /**错误码*/
    private Integer code;
    /**提示信息*/
    private String msg;
    /**内容*/
    private T data;
}
