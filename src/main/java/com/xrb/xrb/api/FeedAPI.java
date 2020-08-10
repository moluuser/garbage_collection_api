package com.xrb.xrb.api;

import com.xrb.xrb.entity.Feed;
import com.xrb.xrb.mapper.FeedMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;

@RestController
@RequestMapping("/api/Feed")
public class FeedAPI {
    @Resource
    FeedMapper feedMapper;

    @GetMapping("/addFeed")
    public Integer addFeed(String msg, String tel, String username) {
        Feed feed = new Feed();
        Date utilDate = new Date();
        java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());

        feed.setTel(tel);
        feed.setMsg(msg);
        feed.setUsername(username);
        feed.setFdate(sqlDate);

        return feedMapper.addFeed(feed);
    }
}
