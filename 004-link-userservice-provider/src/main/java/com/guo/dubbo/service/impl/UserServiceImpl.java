package com.guo.dubbo.service.impl;

import com.guo.dubbo.model.User;
import com.guo.dubbo.service.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public User queryUserById(Integer id) {
        User user = new User();
        user.setId(id);
        user.setUsername("张三");
        return user;
    }

    @Override
    public Integer queryAllUserCount() {
        return 52;
    }
}
