package com.example.model.entity;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("UserEntity")
@Data
public class UserEntity {

    private Integer userId;

    private String userName;

    private Integer userAge;
}