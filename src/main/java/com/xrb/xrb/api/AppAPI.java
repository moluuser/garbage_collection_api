package com.xrb.xrb.api;

import com.xrb.xrb.entity.App;
import com.xrb.xrb.mapper.AppMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/api/App")
public class AppAPI {
    @Resource
    AppMapper appMapper;

    @GetMapping("/getAppInfo")
    public App getAppInfo() {
        return appMapper.getAppInfo();
    }
}
