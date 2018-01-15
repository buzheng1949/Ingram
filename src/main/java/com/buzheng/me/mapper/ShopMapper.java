package com.buzheng.me.mapper;

import com.buzheng.me.domain.entity.Shop;
import com.buzheng.me.domain.query.ShopQuery;
import com.buzheng.me.mapper.provider.ShopProvider;
import org.apache.ibatis.annotations.*;

import java.util.Date;
import java.util.List;

@Mapper
public interface ShopMapper {

    @InsertProvider(type = ShopProvider.class, method = "insert")
    int insert(ShopQuery shopQuery);

    @InsertProvider(type = ShopProvider.class, method = "update")
    int update(ShopQuery shopQuery);


    @SelectProvider(type = ShopProvider.class, method = "query")
    @Results({
            @Result(property = "shopId", column = "shop_id"),
            @Result(property = "ownerId", column = "owner_id"),
            @Result(property = "areaId", column = "area_id"),
            @Result(property = "shopCategoryId", column = "shop_category_id"),
            @Result(property = "parentCategoryId", column = "parent_category_id"),
            @Result(property = "shopName", column = "shop_name"),
            @Result(property = "shopDesc", column = "shop_desc"),
            @Result(property = "shopAddr", column = "shop_addr"),
            @Result(property = "phone", column = "phone"),
            @Result(property = "shopImg", column = "shop_img"),
            @Result(property = "longitude", column = "longitude"),
            @Result(property = "createTime", column = "create_time"),
            @Result(property = "lastEditTime", column = "last_edit_time"),
            @Result(property = "enableStatus", column = "enable_status"),
            @Result(property = "advice", column = "advice")
    })
    List<Shop> query(ShopQuery shopQuery);
}