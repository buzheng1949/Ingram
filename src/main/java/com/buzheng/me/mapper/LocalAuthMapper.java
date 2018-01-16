package com.buzheng.me.mapper;

import com.buzheng.me.domain.entity.LocalAuth;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LocalAuthMapper {
    int deleteByPrimaryKey(Integer localAuthId);

    int insert(LocalAuth record);

    int insertSelective(LocalAuth record);

    LocalAuth selectByPrimaryKey(Integer localAuthId);

    int updateByPrimaryKeySelective(LocalAuth record);

    int updateByPrimaryKey(LocalAuth record);
}