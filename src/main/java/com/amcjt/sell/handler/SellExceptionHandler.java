package com.amcjt.sell.handler;

import com.amcjt.sell.exception.SellException;
import com.amcjt.sell.utils.ResultVOUtil;
import com.amcjt.sell.vo.ResultVO;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author jbhim
 * @date 2018/6/12/012.
 */
@ControllerAdvice
public class SellExceptionHandler {

    @ExceptionHandler(value = SellException.class)
    @ResponseBody
    public ResultVO handlerSellerException(SellException e) {
        return ResultVOUtil.error(e.getCode(), e.getMessage());
    }
}
