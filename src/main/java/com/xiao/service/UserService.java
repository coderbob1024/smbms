package com.xiao.service;

import com.xiao.pojo.User;

public interface UserService {
    //用户登录
    public User login(String userCode, String password);
}
