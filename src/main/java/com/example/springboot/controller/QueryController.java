package com.example.springboot.controller;

import com.example.springboot.bean.Person;
import com.example.springboot.bean.User;
import com.example.springboot.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
public class QueryController {
    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping("/users")
    public List<User> queryUsers() {
        //从数据库中查询用户信息
        List<User> Users = userService.getUsers();
        return Users;
    }


}
