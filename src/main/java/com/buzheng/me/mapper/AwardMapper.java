package com.buzheng.me.mapper;

import com.buzheng.me.domain.entity.Award;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AwardMapper {
    int deleteByPrimaryKey(Integer awardId);

    int insert(Award record);

    int insertSelective(Award record);

    Award selectByPrimaryKey(Integer awardId);

    int updateByPrimaryKeySelective(Award record);

    int updateByPrimaryKey(Award record);
}