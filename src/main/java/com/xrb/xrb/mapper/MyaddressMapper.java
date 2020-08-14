package com.xrb.xrb.mapper;

import com.xrb.xrb.entity.Myaddress;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface MyaddressMapper {
    @Select("SELECT * FROM myaddress WHERE uid = #{uid}")
    List<Myaddress> getMyaddressByUid(Integer uid);

    @Select("SELECT * FROM myaddress WHERE aid = #{aid}")
    Myaddress getMyaddressById(Integer aid);

    @Insert("INSERT INTO myaddress(uid, contactname, contacttel, homeaddress, detailaddress) VALUE(#{uid}, #{contactname}, #{contacttel}, #{homeaddress}, #{detailaddress})")
    Integer addMyaddress(Myaddress myaddress);

    @Delete("DELETE FROM myaddress WHERE aid=#{aid}")
    Integer delMyaddressById(Integer aid);

    @Update("UPDATE myaddress SET contactname = #{contactname}, contacttel = #{contacttel}, homeaddress = #{homeaddress}, detailaddress = #{detailaddress} WHERE aid = #{aid}")
    Integer updMyaddressById(@Param("aid") Integer aid, @Param("contactname") String contactname, @Param("contacttel") String contacttel, @Param("homeaddress") String homeaddress, @Param("detailaddress") String detailaddress);
}
