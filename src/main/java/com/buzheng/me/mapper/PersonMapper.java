package com.buzheng.me.mapper;

import com.buzheng.me.domain.Person;

public interface PersonMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(Person record);

    int insertSelective(Person record);

    Person selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(Person record);

    int updateByPrimaryKey(Person record);
}