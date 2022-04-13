package com.example.springboot.service.impl;

import com.example.springboot.bean.User;
import com.example.springboot.service.UserService;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;


@RunWith(SpringRunner.class) //等价于使用 @RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
class UserServiceImplTest {
    @Autowired
    UserService userService;

    @Test
    void getUserNamebyid() {
    String userid="001";
    String username=  userService.getUserNamebyid(userid);
    Assert.assertEquals(username,"testing");
    }

    @Test
    void getUsers() {
        List list = new ArrayList<String>();
        list=userService.getUsers();

        Assert.assertNotNull(list);

        Object[] userinfo=list.toArray();

        for (int i = 0; i <userinfo.length ; i++) {

            User user=(User)userinfo[i];

            System.out.println(user.getUserName()+user.getUserId());
        }

    }


}