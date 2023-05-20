package com.jiachengx25.springbootmall.dao;

import com.jiachengx25.springbootmall.dto.UserRegisterRequest;
import com.jiachengx25.springbootmall.model.User;

public interface UserDao {

    User getUserById(Integer userId);

    Integer createUser(UserRegisterRequest userRegisterRequest);
}
