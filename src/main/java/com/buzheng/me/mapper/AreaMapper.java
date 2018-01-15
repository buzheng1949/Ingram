package com.buzheng.me.mapper;

import com.buzheng.me.domain.entity.Area;
import com.buzheng.me.domain.query.AreaQuery;
import com.buzheng.me.mapper.provider.AreaMapperProvider;
import org.apache.ibatis.annotations.*;

@Mapper
public interface AreaMapper {



//    @Select("SELECT * FROM tb_area WHERE area_id = #{areaId} and area_name = #{areaName} and " +
//            "area_desc = #{areaDesc} and create_time = #{createTime} and last_edit_time = #{lastEditTime} ")

    @SelectProvider(type = AreaMapperProvider.class,method ="query" )
    @Results({
            @Result(property = "areaId",  column = "area_id"),
            @Result(property = "areaName", column = "area_name"),
            @Result(property = "areaDesc", column = "area_desc"),
            @Result(property = "createTime", column = "create_time"),
            @Result(property = "lastEditTime", column = "last_edit_time")
    })
    Area selectArea(AreaQuery record);


    @InsertProvider(type = AreaMapperProvider.class,method ="insert" )
    int insert(AreaQuery record);

    @InsertProvider(type = AreaMapperProvider.class,method = "update")
    int update(AreaQuery areaQuery);


}