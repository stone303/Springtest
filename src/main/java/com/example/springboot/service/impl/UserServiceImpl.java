package com.example.springboot.service.impl;

import com.example.springboot.bean.User;
import com.example.springboot.config.BaseResult;
import com.example.springboot.mapper.UserMapper;
import com.example.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public String getUserNamebyid(String userid) {
        String username = userMapper.getUserNamebyid(userid);
        return username;
    }

    @Override
    public List<User> getUsers()
    {
        List<User> users=userMapper.getUsers();
        return users;
    }

}
