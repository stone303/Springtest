package com.example.springboot.utils;

import com.example.springboot.config.BaseResult;
import com.example.springboot.config.ResultEnum;
import com.example.springboot.config.exceptionHandle.UserException;


public class ResultUtil {

    public static BaseResult success(Object object) {
        BaseResult result = new BaseResult();
        result.setCode(ResultEnum.SUCCESS.getCode());
        result.setMsg(ResultEnum.SUCCESS.getMsg());
        result.setData(object);
        return result;
    }

    public static BaseResult success() {
        return success(null);
    }

    public static BaseResult error(Integer code, String msg) {
        BaseResult result = new BaseResult();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }
    public static BaseResult error(ResultEnum resultEnum) {
        return error(resultEnum.getCode(),resultEnum.getMsg());
    }
    public static BaseResult error(UserException userException) {
        return error(userException.getCode(),userException.getMessage());
    }
}
