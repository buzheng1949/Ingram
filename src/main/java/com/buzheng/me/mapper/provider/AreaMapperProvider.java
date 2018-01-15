package com.buzheng.me.mapper.provider;

import com.buzheng.me.domain.entity.Area;
import com.buzheng.me.domain.query.AreaQuery;
import com.buzheng.me.utils.SQLHelper;
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

    private Logger logger = LoggerFactory.getLogger(AreaMapperProvider.class);

    /**
     * 查询语句 查询条件
     *
     * @param area 其实这里不要用domain来查比较好 另外写query比较靠谱
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
                FROM("tb_area");
                WHERE("area_id = " + areaId);
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
        String matchSql = sql.toString();
        return matchSql;
    }

    /**
     * 插入语句
     *
     * @param areaQuery
     * @return
     */
    public String insert(AreaQuery areaQuery) {
        String areaDesc = areaQuery.getAreaDesc();
        String areaName = areaQuery.getAreaName();
        Integer priority = areaQuery.getPriority();
        Integer createTime = areaQuery.getCreateTime();
        Integer lastEditTime = areaQuery.getLastEditTime();
        String columns = "area_desc,area_name,priority,create_time,last_edit_time";
//        String values = "'"+areaDesc +"'"+ "," +"'"+ areaName + "'"+"," +"'"+ priority + "'"+"," +"'"+ createTime +"'" +"," +"'"+ lastEditTime+"'";
        String values = SQLHelper.buildValues(areaDesc,areaName,priority,createTime,lastEditTime);
        SQL sql = new SQL() {
            {
                INSERT_INTO("tb_area");
                VALUES(columns, values);
            }
        };
        logger.error(sql.toString());
        return sql.toString();
    }


}
