package com.buzheng.me.mapper;

import com.buzheng.me.domain.entity.ShopAuthMap;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ShopAuthMapMapper {
    int deleteByPrimaryKey(Integer shopAuthId);

    int insert(ShopAuthMap record);

    int insertSelective(ShopAuthMap record);

    ShopAuthMap selectByPrimaryKey(Integer shopAuthId);

    int updateByPrimaryKeySelective(ShopAuthMap record);

    int updateByPrimaryKey(ShopAuthMap record);
}