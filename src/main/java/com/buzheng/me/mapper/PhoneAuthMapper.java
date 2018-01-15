package com.buzheng.me.mapper;

import com.buzheng.me.domain.entity.PhoneAuth;

public interface PhoneAuthMapper {
    int deleteByPrimaryKey(Integer phoneAuthId);

    int insert(PhoneAuth record);

    int insertSelective(PhoneAuth record);

    PhoneAuth selectByPrimaryKey(Integer phoneAuthId);

    int updateByPrimaryKeySelective(PhoneAuth record);

    int updateByPrimaryKey(PhoneAuth record);
}