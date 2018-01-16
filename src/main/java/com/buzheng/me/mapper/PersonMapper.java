package com.buzheng.me.mapper;

import com.buzheng.me.domain.Person;
import com.buzheng.me.domain.query.PersonQuery;
import com.buzheng.me.mapper.provider.PersonProvider;
import org.apache.ibatis.annotations.*;

@Mapper
public interface PersonMapper {

    @InsertProvider(type = PersonProvider.class, method = "insert")
    int insert(PersonQuery personQuery);

    @SelectProvider(type = PersonProvider.class, method = "query")
    @Results({
            @Result(property = "userId", column = "user_id"),
            @Result(property = "name", column = "name"),
            @Result(property = "birthday", column = "birthday"),
            @Result(property = "gender", column = "gender"),
            @Result(property = "phone", column = "phone"),
            @Result(property = "email", column = "email"),
            @Result(property = "profileImg", column = "profile_img"),
            @Result(property = "customerFlag", column = "customer_flag"),
            @Result(property = "shopOwnerFlag", column = "shop_owner_flag"),
            @Result(property = "adminFlag", column = "admin_flag"),
            @Result(property = "createTime", column = "create_time"),
            @Result(property = "lastEditTime", column = "last_edit_time"),
            @Result(property = "enableStatus", column = "enable_status")
    })
    Person query(PersonQuery personQuery);


}