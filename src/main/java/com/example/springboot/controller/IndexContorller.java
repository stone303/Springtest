package com.example.springboot.controller;

import com.example.springboot.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexContorller {

    @Autowired
    private Person person;

    @ResponseBody
    @RequestMapping (value ="/springboot/test")
    public Person test()
    {
        return person;
    }

    @ResponseBody
    @RequestMapping("/hello")
    public String hello() {
        return "Hello World!";
    }


}
