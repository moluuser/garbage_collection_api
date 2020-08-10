package com.xrb.xrb.mapper;

import com.xrb.xrb.entity.Feed;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface FeedMapper {
    @Insert("INSERT INTO feed(tel, msg, username, fdate) VALUE(#{tel}, #{msg}, #{username}, #{fdate})")
    Integer addFeed(Feed feed);
}
