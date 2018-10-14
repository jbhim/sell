package com.amcjt.sell.exception;

import com.amcjt.sell.enums.ResultEnum;
import lombok.Getter;

/**
 * @author jbhim
 * @date 2018/6/14/004.
 */
@Getter
public class SellException extends RuntimeException {
    private Integer code;

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }
    public SellException(ResultEnum resultEnum, String msg) {
        super(msg);
        this.code = resultEnum.getCode();
    }

}
