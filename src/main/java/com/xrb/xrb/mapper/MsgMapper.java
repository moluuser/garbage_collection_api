package com.xrb.xrb.mapper;

import com.xrb.xrb.entity.Msg;
import com.xrb.xrb.entity.Scorelog;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface MsgMapper {
    @Select("SELECT * FROM msg WHERE uid = #{uid}")
    List<Scorelog> getMsgByUid(Integer uid);

    @Insert("INSERT INTO `msg`(uid, title, content, createtime) VALUE(#{uid}, #{title}, #{content}, #{createtime})")
    Integer addMsg(Msg msg);

    @Delete("DELETE FROM `msg` WHERE mid=#{mid}")
    Integer delMsgById(Integer mid);
}
