package com.example.springboot.config.exceptionHandle;

import com.example.springboot.config.BaseResult;
import com.example.springboot.config.exceptionHandle.UserException;
import com.example.springboot.utils.ResultUtil;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 统一异常处理
 */
@ControllerAdvice
public class ExceptionHandle {
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public BaseResult handle(Exception e) {
        if (e instanceof UserException) {
            UserException userException = (UserException) e;
            return ResultUtil.error(userException);
        } else {
            return ResultUtil.error(-1, e.getMessage());
        }
    }
}
