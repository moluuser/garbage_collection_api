package com.xrb.xrb.mapper;

import com.xrb.xrb.entity.Scorelog;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ScorelogMapper {
    @Select("SELECT * FROM scorelog WHERE uid = #{uid}")
    List<Scorelog> getScorelogByUid(Integer uid);

    @Insert("INSERT INTO scorelog VALUE(#{sid}, #{uid}, #{createtime}, #{delta}, #{detail})")
    Integer addScorelog(Scorelog scorelog);
}
