package com.xrb.xrb.api;

import com.xrb.xrb.entity.User;
import com.xrb.xrb.mapper.UserMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/api/User")
public class UserAPI {
    @Resource
    UserMapper userMapper;

    @GetMapping("/getUserList")
    public List<User> getUserList() {
        return userMapper.getUserList();
    }

    @GetMapping("/getUserByName")
    public User getUserByName(String username) {
        return userMapper.getUserByName(username);
    }

    @GetMapping("/getUserById")
    public User getUserById(Integer uid) {
        return userMapper.getUserById(uid);
    }

    @GetMapping("/login")
    public Integer login(String username, String password) {
        return userMapper.login(username, password);
    }

    @GetMapping("/getUserScoreById")
    public User getUserScoreById(Integer uid) {
        return userMapper.getUserById(uid);
    }

    @GetMapping("/addUser")
    public Integer addUser(String username, String password) {
        return userMapper.addUser(username, password);
    }

    @GetMapping("/updUserPwdById")
    public Integer updUserPwdById(Integer uid, String password) {
        return userMapper.updUserPwdById(uid, password);
    }

    @GetMapping("/updUserAvaById")
    public Integer updUserAvaById(Integer uid, String avatar) {
        return userMapper.updUserAvaById(uid, avatar);
    }

    @GetMapping("/updUserTelById")
    public Integer updUserTelById(Integer uid, String tel) {
        return userMapper.updUserTelById(uid, tel);
    }

    @GetMapping("/updUserScoreById")
    public Integer updUserScoreById(Integer uid, String score) {
        return userMapper.updUserScoreById(uid, score);
    }
}
