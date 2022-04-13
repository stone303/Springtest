package com.example.springboot.config;

import lombok.Data;

@Data
public class BaseResult<T> {
    //返回码
    private Integer code;
    //提示信息
    private String msg;
    //返回具体内容
    private T data;

}
