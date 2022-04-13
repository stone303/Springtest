package com.example.springboot.bean;

public class User {
    private Integer id;
    private String userId;
    private String userName;
    private String password;
    private String email;

    public  User()
    {

    }

    public User(int id,String userId,String userName,String password,String email)
    {
        this.id=id;
        this.userId=userId;
        this.userName=userName;
        this.password=password;
        this.email=email;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        //this.userId = userId;
        //trim() 方法用于删除字符串的头尾空白符。
        this.userId = userId == null ? null : userId.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
       // this.userName = userName;
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        //this.password = password;
        this.password = password == null ? null : password.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
       // this.email = email;
        this.email = email == null ? null : email.trim();
    }

    @Override
    public String toString() {
        return "User{" +
                "Id='" + id + '\'' +
                ", UserId=" + userId +
                ", UserName=" + userName +
                ", Password=" + password +
                ", email=" + email +
                '}';
    }
}
