package com.shsxt.controller;

import com.shsxt.models.User;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.shsxt.service.UserService;

import javax.annotation.Resource;

/**
 * Created by administer on 2017/10/10.
 */
@MapperScan("com.shsxt.dao")
@RestController
@RequestMapping("user")
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("find/{id}")
    public User findById(@PathVariable Integer id) {
        User user = userService.findById(id);
        return user;
    }

}
