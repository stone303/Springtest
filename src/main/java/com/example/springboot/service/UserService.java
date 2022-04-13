package com.example.springboot.service;

import com.example.springboot.bean.User;
import com.example.springboot.config.BaseResult;

import java.util.List;

public interface UserService {

    public String getUserNamebyid(String userid);

    public List<User> getUsers();



}
