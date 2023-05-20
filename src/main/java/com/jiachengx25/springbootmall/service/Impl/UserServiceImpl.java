package com.jiachengx25.springbootmall.service.Impl;

import com.jiachengx25.springbootmall.dao.UserDao;
import com.jiachengx25.springbootmall.dto.UserRegisterRequest;
import com.jiachengx25.springbootmall.model.User;
import com.jiachengx25.springbootmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {
        return userDao.createUser(userRegisterRequest);
    }

}
