package com.xrb.xrb.api;

import com.xrb.xrb.entity.User;
import com.xrb.xrb.mapper.UserMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.misc.BASE64Encoder;

import javax.annotation.Resource;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/User")
public class UserAPI {
    @Resource
    UserMapper userMapper;

    public String EncoderByMd5(String str) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        //确定计算方法
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        BASE64Encoder base64en = new BASE64Encoder();
        //加密后的字符串
        String newStr = base64en.encode(md5.digest(str.getBytes(StandardCharsets.UTF_8)));
        return newStr;
    }

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


    @GetMapping("/getUserTelById")
    public String getUserTelById(Integer uid) {
        return userMapper.getUserTelById(uid);
    }

    @GetMapping("/login")
    public Integer login(String username, String password) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        return userMapper.login(username, EncoderByMd5(password));
    }

    @GetMapping("/getUserScoreById")
    public Integer getUserScoreById(Integer uid) {
        return userMapper.getUserScoreById(uid);
    }

    @GetMapping("/addUser")
    public Integer addUser(String username, String password) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        return userMapper.addUser(username, EncoderByMd5(password));
    }

    @GetMapping("/updUserPwdById")
    public Integer updUserPwdById(Integer uid, String password) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        return userMapper.updUserPwdById(uid, EncoderByMd5(password));
    }

    @GetMapping("/updUserPwdByName")
    public Integer updUserPwdByName(String username, String password) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        return userMapper.updUserPwdByName(username, EncoderByMd5(password));
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
    public Integer updUserScoreById(Integer uid, Integer changevar) {
        Date utilDate = new Date();
        java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
//        判断是否为同一天
        if (Math.abs(sqlDate.getTime() - userMapper.getUserSdateById(uid).getTime()) > 3600000 * 24)
            return userMapper.updUserScoreById(uid, changevar, sqlDate);
        else
            return -1;
    }

    @GetMapping("/updUserScore")
    public Integer updUserScore(Integer uid, Integer changevar) {
        return userMapper.updUserScore(uid, changevar);
    }
}
