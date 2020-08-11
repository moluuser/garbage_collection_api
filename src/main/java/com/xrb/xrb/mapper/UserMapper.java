package com.xrb.xrb.mapper;

import com.xrb.xrb.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("SELECT * FROM user")
    List<User> getUserList();

    @Select("SELECT COUNT(*) FROM user WHERE username=#{username} and password=#{password}")
    Integer login(@Param("username") String username, @Param("password") String password);

    @Select("SELECT * FROM user WHERE username=#{username}")
    User getUserByName(String username);

    @Select("SELECT * FROM user WHERE uid=#{uid}")
    User getUserById(Integer uid);

    @Select("SELECT score FROM user WHERE uid=#{uid}")
    User getUserScoreById(Integer uid);

    @Insert("INSERT INTO user(username, password) VALUE(#{username}, #{password})")
    Integer addUser(@Param("username") String username, @Param("password") String password);

    @Update("UPDATE user SET password = #{password} WHERE uid = #{uid}")
    Integer updUserPwdById(@Param("uid") Integer uid, @Param("password") String password);

    @Update("UPDATE user SET password = #{password} WHERE username = #{username}")
    Integer updUserPwdByName(@Param("username") String username, @Param("password") String password);

    @Update("UPDATE user SET avatar = #{avatar} WHERE uid = #{uid}")
    Integer updUserAvaById(@Param("uid") Integer uid, @Param("avatar") String avatar);

    @Update("UPDATE user SET tel = #{tel} WHERE uid = #{uid}")
    Integer updUserTelById(@Param("uid") Integer uid, @Param("tel") String tel);

    @Update("UPDATE user SET score = #{score} WHERE uid = #{uid}")
    Integer updUserScoreById(@Param("uid") Integer uid, @Param("score") String score);

}
