package com.xrb.xrb.controller;

import com.xrb.xrb.entity.User;
import com.xrb.xrb.mapper.UserMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/User")
public class UserController {
    @Resource
    UserMapper userMapper;

    @GetMapping("/getUserList")
    public List<User> getUserList() {
        return userMapper.getUserList();
    }
}
