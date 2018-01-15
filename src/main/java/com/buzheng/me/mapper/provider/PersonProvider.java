package com.buzheng.me.mapper.provider;

import com.buzheng.me.domain.query.AreaQuery;
import com.buzheng.me.domain.query.PersonQuery;
import com.buzheng.me.utils.SQLHelper;
import com.buzheng.me.utils.TimeHelper;
import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.jdbc.SQL;

/**
 * Created by buzheng on 18/1/15.
 */
public class PersonProvider {

    public static final String TABLE = "tb_person_info";

    /**
     * 插入语句
     *
     * @param personQuery
     * @return
     */
    public String insert(PersonQuery personQuery) {
        Integer adminFlag = personQuery.getAdminFlag();
        Integer birthday = personQuery.getBirthday();
        Integer customerFlag = personQuery.getCustomerFlag();
        String email = personQuery.getEmail();
        String gender = personQuery.getGender();
        String name = personQuery.getName();
        Integer userId = personQuery.getUserId();
        String  profileImg = personQuery.getProfileImg();
        Integer shopOwnerFlag = personQuery.getShopOwnerFlag();
        Integer enableStatus = personQuery.getEnableStatus();
        String phone = personQuery.getPhone();
        String columns = "admin_flag,birthday,customer_flag,email,gender,name,user_id,shop_owner_flag,enable_status,phone,profile_img,create_time,last_edit_time";
        String values = SQLHelper.buildValues(adminFlag, birthday, customerFlag, email, gender, name, userId, shopOwnerFlag,
                enableStatus, phone,profileImg, TimeHelper.getCurrentTime(),TimeHelper.getCurrentTime());
        SQL sql = new SQL() {
            {
                INSERT_INTO(TABLE);
                VALUES(columns, values);
            }
        };
        return sql.toString();
    }

    /**
     * 查询语句 查询条件
     *
     * @param personQuery 查询条件
     * @return
     */
    public String query(PersonQuery personQuery) {
        String phone = personQuery.getPhone();
        if (StringUtils.isEmpty(phone)) {
            throw new RuntimeException("the userId cannot be empty");
        }
        SQL sql = new SQL() {
            {
                SELECT("*");
                FROM(TABLE);
                WHERE("phone = " + phone);
            }
        };
        return sql.toString();
    }


}
