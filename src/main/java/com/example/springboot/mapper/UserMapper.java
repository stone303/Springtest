package com.example.springboot.mapper;

import com.example.springboot.bean.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

//当 mapper 接口较多时，我们可以在 Spring Boot 主启动类上使用 @MapperScan 注解扫描指定包下的 mapper 接口，
// 而不再需要在每个 mapper 接口上都标注 @Mapper 注解。
@Mapper
public interface UserMapper {

    //通过用户名密码查询用户数据
    User getByUserNameAndPassword(User user);

    //通过用户名密码查询用户数据
    String getUserNamebyid(String userid);

    //查询用户数据
    List<User> getUsers();


}
