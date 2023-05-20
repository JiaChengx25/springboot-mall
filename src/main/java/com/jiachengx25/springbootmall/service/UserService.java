package com.jiachengx25.springbootmall.service;

import com.jiachengx25.springbootmall.dto.UserRegisterRequest;
import com.jiachengx25.springbootmall.model.User;

public interface UserService {

    User getUserById(Integer userId);

    Integer register(UserRegisterRequest userRegisterRequest);



}
