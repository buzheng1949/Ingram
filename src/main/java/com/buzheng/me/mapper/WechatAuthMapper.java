package com.buzheng.me.mapper;

import com.buzheng.me.domain.entity.WechatAuth;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface WechatAuthMapper {
    int deleteByPrimaryKey(Integer wechatAuthId);

    int insert(WechatAuth record);

    int insertSelective(WechatAuth record);

    WechatAuth selectByPrimaryKey(Integer wechatAuthId);

    int updateByPrimaryKeySelective(WechatAuth record);

    int updateByPrimaryKey(WechatAuth record);
}