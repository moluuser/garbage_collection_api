package com.xrb.xrb.mapper;

import com.xrb.xrb.entity.Product;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface ProductMapper {
    @Select("SELECT * FROM product")
    List<Product> getProductList();

    @Update("UPDATE product SET num = #{num} WHERE pid = #{pid}")
    Integer updProductNumById(@Param("num") Integer num, @Param("pid") Integer pid);

    @Select("SELECT num FROM product WHERE pid = #{pid}")
    Integer getProductNumById(Integer pid);
}
