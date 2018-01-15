package com.buzheng.me.api;

import com.buzheng.me.domain.entity.Area;
import com.buzheng.me.domain.query.AreaQuery;

import java.util.List;


/**
 * Created by buzheng on 18/1/15.
 */
public interface AreaApi {
    /**
     * 获取所有的区域列表
     *
     * @return 返回所有的区域列表
     */
    List<Area> getAreas();

    /**
     * 返回当前条件下唯一的区域
     *
     * @param areaId 查询当前区域区域信息
     * @return
     */
    Area getArea(Integer areaId);

    /**
     * 查询满足条件的所有区域信息
     *
     * @param areaQuery
     * @return
     */
    List<Area> getAreaList(AreaQuery areaQuery);

    /**
     * 插入区域信息
     *
     * @param areaQuery 插入条件
     * @return
     */
    boolean insertArea(AreaQuery areaQuery);

    /**
     * 更新区域信息
     *
     * @param areaQuery
     * @return
     */
    boolean updateArea(AreaQuery areaQuery);
}
