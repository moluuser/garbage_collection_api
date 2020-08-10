package com.xrb.xrb.mapper;

import com.xrb.xrb.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface OrderMapper {
    @Select("SELECT * FROM order")
    List<User> getOrderList();
}
