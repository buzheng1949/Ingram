package com.buzheng.me.mapper;

import com.buzheng.me.domain.AwardMap;

public interface AwardMapMapper {
    int deleteByPrimaryKey(Integer userAwardId);

    int insert(AwardMap record);

    int insertSelective(AwardMap record);

    AwardMap selectByPrimaryKey(Integer userAwardId);

    int updateByPrimaryKeySelective(AwardMap record);

    int updateByPrimaryKey(AwardMap record);
}