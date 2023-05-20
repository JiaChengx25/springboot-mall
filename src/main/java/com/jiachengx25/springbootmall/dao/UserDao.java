package com.jiachengx25.springbootmall.dao;

import com.jiachengx25.springbootmall.dto.UserRegisterRequest;
import com.jiachengx25.springbootmall.model.User;

public interface UserDao {

    User getUserById(Integer userId);

    User getUserByEmail(String email);

    Integer createUser(UserRegisterRequest userRegisterRequest);
}
