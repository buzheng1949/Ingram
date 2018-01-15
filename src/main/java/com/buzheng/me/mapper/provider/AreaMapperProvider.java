package com.buzheng.me.mapper.provider;

import com.buzheng.me.domain.entity.Area;
import com.buzheng.me.domain.query.AreaQuery;
import com.buzheng.me.utils.SQLHelper;
import com.buzheng.me.utils.TimeHelper;
import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.jdbc.SQL;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;


/**
 * Created by buzheng on 18/1/15.
 * mapper SQL 提供类
 */
public class AreaMapperProvider {

    public static final String TABLE = "tb_area";

    private Logger logger = LoggerFactory.getLogger(AreaMapperProvider.class);

    /**
     * 查询语句 查询条件
     *
     * @param area 查询条件
     * @return
     */
    public String query(AreaQuery area) {
        Integer areaId = area.getAreaId();
        String areaDesc = area.getAreaDesc();
        String areaName = area.getAreaName();
        Integer priority = area.getPriority();
        SQL sql = new SQL() {
            {
                SELECT("*");
                FROM(TABLE);
                if (areaId != null) {
                    WHERE("area_id = " + areaId);
                }
                if (StringUtils.isNotEmpty(areaDesc)) {
                    WHERE("area_desc = '" + areaDesc + "'");
                }
                if (StringUtils.isNotEmpty(areaName)) {
                    WHERE("area_name = '" + areaName + "'");
                }
                if (priority != null) {
                    WHERE("priority = '" + priority + "'");
                }
            }
        };
        return sql.toString();
    }


    /**
     * 插入语句
     *
     * @param areaQuery
     * @return
     */
    public String insert(AreaQuery areaQuery) {
        String areaName = areaQuery.getAreaName();
        if (StringUtils.isEmpty(areaName)) {
            throw new RuntimeException("the area_name is must not be empey");
        }
        String areaDesc = areaQuery.getAreaDesc();
        Integer priority = areaQuery.getPriority();
        Integer createTime = areaQuery.getCreateTime();
        Integer lastEditTime = areaQuery.getLastEditTime();
        String columns = "area_desc,area_name,priority,create_time,last_edit_time";
        String values = SQLHelper.buildValues(areaDesc, areaName, priority, createTime, lastEditTime);
        SQL sql = new SQL() {
            {
                INSERT_INTO(TABLE);
                VALUES(columns, values);
            }
        };
        return sql.toString();
    }

    /**
     * 更新区域信息
     *
     * @param areaQuery
     * @return
     */
    public String update(AreaQuery areaQuery) {
        String areaDesc = areaQuery.getAreaDesc();
        String areaName = areaQuery.getAreaName();
        Integer priority = areaQuery.getPriority();
        Integer lastEditTime = TimeHelper.getCurrentTime();
        SQL sql = new SQL() {
            {
                UPDATE(TABLE);
                if (StringUtils.isNotEmpty(areaDesc)) {
                    SET("area_desc = '" + areaDesc + "'");
                }
                if (priority != null) {
                    SET("priority = '" + priority + "'");
                }
                SET("last_edit_time= '" + lastEditTime + "'");
                WHERE("area_name = '" + areaName + "'");
            }
        };
        return sql.toString();

    }


}
