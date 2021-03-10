package com.guo.dubbo.service.impl;

import com.guo.dubbo.model.User;
import com.guo.dubbo.service.UserService;

public class UserServiceImpl implements UserService {

    @Override
    public User queryUserById(Integer id, String username) {
        User user = new User();
        user.setId(id);
        user.setUsername(username);

        return user;
    }
}
