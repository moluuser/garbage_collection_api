package com.xrb.xrb.mapper;

import com.xrb.xrb.entity.Order;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface OrderMapper {
    @Select("SELECT * FROM `order`")
    List<Order> getOrderList();

    @Insert("INSERT INTO `order` VALUE(#{oid}, #{uid}, #{status}, #{createtime}, #{contactname}, #{contacttel}, #{homeaddress}, #{detailaddress}, #{goodstype}, #{goodsname}, #{goodsnum}, #{price}, #{hometype}, #{hometime}, #{detail}, #{photo})")
    Integer addOrder(Order order);

    @Update("UPDATE `order` SET status = #{status} WHERE oid = #{oid}")
    Integer updStatusById(@Param("oid") Integer oid, @Param("status") String status);

    @Select("SELECT * FROM `order` WHERE oid = #{oid}")
    Order getOrderById(Integer oid);

    @Select("SELECT * FROM `order` WHERE uid = #{uid}")
    List<Order> getOrderListByUid(Integer uid);
}
