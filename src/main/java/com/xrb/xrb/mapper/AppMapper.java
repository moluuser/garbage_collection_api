package com.xrb.xrb.mapper;

import com.xrb.xrb.entity.App;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface AppMapper {
    @Select("SELECT * FROM app WHERE aid = 1")
    App getAppInfo();

    @Select("SELECT index1 FROM app WHERE aid = 1")
    String getIndex1();

    @Select("SELECT index2 FROM app WHERE aid = 1")
    String getIndex2();

    @Select("SELECT index3 FROM app WHERE aid = 1")
    String getIndex3();

    @Select("SELECT index4 FROM app WHERE aid = 1")
    String getIndex4();

    @Select("SELECT guide_msg FROM app WHERE aid = 1")
    String getMsg();
}
