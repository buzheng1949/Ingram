package com.buzheng.me.mapper;

import com.buzheng.me.domain.entity.ProductImg;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProductImgMapper {
    int deleteByPrimaryKey(Integer productImgId);

    int insert(ProductImg record);

    int insertSelective(ProductImg record);

    ProductImg selectByPrimaryKey(Integer productImgId);

    int updateByPrimaryKeySelective(ProductImg record);

    int updateByPrimaryKey(ProductImg record);
}