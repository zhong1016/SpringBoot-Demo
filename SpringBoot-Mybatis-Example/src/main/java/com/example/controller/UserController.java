package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.vo.UserVO;
import com.example.service.impl.UserServiceIm;

@RestController
@CrossOrigin
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserServiceIm service;

    @GetMapping("")
    public Object getAll() {

        return service.getUserList();
    }

    @GetMapping("/{id}")
    public Object getAll(@PathVariable Integer id) {

        return service.getUserById(id);
    }

    @PostMapping("")
    public Object insertUser(@RequestBody UserVO user) {

        return service.insertUserVO(user);
    }

    @PostMapping("/update")
    public Object updatetUser(@RequestBody UserVO user) {
        System.out.println(user);
        return service.updateUser(user);
    }

    @DeleteMapping("/{id}")
    public Object deleteById(@PathVariable Integer id) {

        return service.deleteUserById(id);
    }
}
