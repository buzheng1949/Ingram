package com.buzheng.me.mapper.provider;

import com.buzheng.me.domain.query.AreaQuery;
import com.buzheng.me.domain.query.PersonQuery;
import com.buzheng.me.domain.query.ShopQuery;
import com.buzheng.me.utils.SQLHelper;
import com.buzheng.me.utils.TimeHelper;
import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.jdbc.SQL;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

/**
 * Created by buzheng on 18/1/16.
 */
public class ShopProvider {

    private Logger logger = LoggerFactory.getLogger(ShopProvider.class);

    public static final String TABLE = "tb_shop";

    /**
     * 插入语句
     *
     * @param shopQuery
     * @return
     */
    public String insert(ShopQuery shopQuery) {
        Integer shopId = shopQuery.getShopId();
        Integer ownerId = shopQuery.getOwnerId();
        Integer areaId = shopQuery.getAreaId();
        Integer shopCategoryId = shopQuery.getShopCategoryId();
        Integer parentCategoryId = shopQuery.getParentCategoryId();
        String shopName = shopQuery.getShopName();
        String shopDesc = shopQuery.getShopDesc();
        String shopAddr = shopQuery.getShopAddr();
        String phone = shopQuery.getPhone();
        String shopImg = shopQuery.getShopImg();
        Double longitude = shopQuery.getLongitude();
        Double latitude = shopQuery.getLatitude();
        Integer priority = shopQuery.getPriority();
        Integer createTime = TimeHelper.getCurrentTime();
        Integer lastEditTime = TimeHelper.getCurrentTime();
        Integer enableStatus = shopQuery.getEnableStatus();
        String advice = shopQuery.getAdvice();
        String columns = "shop_id,owner_id,area_id,shop_category_id,parent_category_id,shop_name,shop_desc," +
                "shop_addr,phone,shop_img,longitude,latitude,create_time,last_edit_time,enable_status,advice,priority";
        String values = SQLHelper.buildValues(shopId, ownerId, areaId, shopCategoryId, parentCategoryId, shopName,
                shopDesc, shopAddr, phone, shopImg, longitude, latitude, createTime, lastEditTime, enableStatus,
                advice, priority);
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
     * @param shopQuery 查询条件
     * @return
     */
    public String query(ShopQuery shopQuery) {
        Integer shopId = shopQuery.getShopId();
        Integer areaId = shopQuery.getAreaId();
        String shopName = shopQuery.getShopName();
        Integer ownerId = shopQuery.getOwnerId();
        Integer categoryId = shopQuery.getShopCategoryId();
        SQL sql = new SQL() {
            {
                SELECT("shop_id,owner_id,area_id,shop_category_id,parent_category_id,shop_name,shop_desc," +
                        "shop_addr,phone,shop_img,longitude,latitude,create_time,last_edit_time,enable_status,advice,priority");
                FROM(TABLE);
                if (shopId != null) {
                    WHERE("shop_id = " + shopId);
                }
                if (areaId != null) {
                    WHERE("area_id = " + areaId);
                }
                if (StringUtils.isNotEmpty(shopName)) {
                    WHERE("shop_name = " + shopName);
                }
                if (ownerId != null) {
                    WHERE("owner_id = " + ownerId);
                }
                if (categoryId != null) {
                    WHERE("shop_category_id = " + categoryId);
                }

            }
        };
        return sql.toString();
    }

    /**
     * 更新店铺信息
     *
     * @param shopQuery
     * @return
     */
    public String update(ShopQuery shopQuery) {
        Integer shopId = shopQuery.getShopId();
        if (shopId == null || shopId <= 0) {
            logger.error("the shopid cannot be empty");
            throw new RuntimeException("the shopid cannot be empty");
        }
        String shopName = shopQuery.getShopName();
        String shopDesc = shopQuery.getShopDesc();
        String shopAddr = shopQuery.getShopAddr();
        String phone = shopQuery.getPhone();
        String shopImg = shopQuery.getShopImg();
        SQL sql = new SQL() {
            {
                UPDATE(TABLE);
                if (StringUtils.isNotEmpty(shopName)) {
                    SET("shop_name = '" + shopName + "'");
                }
                if (StringUtils.isNotEmpty(shopDesc)) {
                    SET("shop_desc = '" + shopDesc + "'");
                }
                if (StringUtils.isNotEmpty(shopAddr)) {
                    SET("shop_addr = '" + shopAddr + "'");
                }
                if (StringUtils.isNotEmpty(phone)) {
                    SET("phone = '" + phone + "'");
                }
                if (StringUtils.isNotEmpty(shopImg)) {
                    SET("shop_img = '" + shopImg + "'");
                }
                SET("last_edit_time= '" + TimeHelper.getCurrentTime() + "'");
                WHERE("shop_id = '" + shopId + "'");
            }
        };
        return sql.toString();

    }


}
