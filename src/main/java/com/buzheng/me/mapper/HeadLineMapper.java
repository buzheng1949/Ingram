package com.buzheng.me.mapper;

import com.buzheng.me.domain.entity.HeadLine;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface HeadLineMapper {
    int deleteByPrimaryKey(Integer lineId);

    int insert(HeadLine record);

    int insertSelective(HeadLine record);

    HeadLine selectByPrimaryKey(Integer lineId);

    int updateByPrimaryKeySelective(HeadLine record);

    int updateByPrimaryKey(HeadLine record);
}