package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mapper.UserMapper;
import com.example.model.entity.UserEntity;
import com.example.model.vo.UserVO;
import com.example.service.intf.UserServiceIn;

@Service
public class UserServiceIm implements UserServiceIn {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<UserEntity> getUserList() {
        return userMapper.getUserList();
    }

    @Override
    public UserEntity getUserById(Integer userId) {
        return userMapper.getUserById(userId);
    }

    @Override
    public int insertUserVO(UserVO user) {
        userMapper.insertUser(user);
        // 取得自增主鍵
        return user.getUserId();
    }

    @Override
    public int updateUser(UserVO user) {

        return userMapper.updateUser(user);
    }

    @Override
    public int deleteUserById(Integer userId) {
        return userMapper.deleteUserById(userId);
    }

}
