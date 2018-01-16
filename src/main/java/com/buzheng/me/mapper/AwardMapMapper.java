package com.buzheng.me.mapper;

import com.buzheng.me.domain.entity.AwardMap;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AwardMapMapper {
    int deleteByPrimaryKey(Integer userAwardId);

    int insert(AwardMap record);

    int insertSelective(AwardMap record);

    AwardMap selectByPrimaryKey(Integer userAwardId);

    int updateByPrimaryKeySelective(AwardMap record);

    int updateByPrimaryKey(AwardMap record);
}