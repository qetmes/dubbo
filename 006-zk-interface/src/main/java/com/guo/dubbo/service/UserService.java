package com.guo.dubbo.service;

import com.guo.dubbo.model.User;

public interface UserService {

    /**
     * 根据用户标识获取用户的信息
     * @param id
     * @return
     */
    User queryUserById(Integer id, String username);
}
