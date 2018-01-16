package com.buzheng.me.mapper;

import com.buzheng.me.domain.entity.UserShopMap;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserShopMapMapper {
    int deleteByPrimaryKey(Integer userShopId);

    int insert(UserShopMap record);

    int insertSelective(UserShopMap record);

    UserShopMap selectByPrimaryKey(Integer userShopId);

    int updateByPrimaryKeySelective(UserShopMap record);

    int updateByPrimaryKey(UserShopMap record);
}