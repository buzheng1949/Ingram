package com.buzheng.me.api.impl;

import com.buzheng.me.api.AreaApi;
import com.buzheng.me.domain.entity.Area;
import com.buzheng.me.domain.query.AreaQuery;
import com.buzheng.me.mapper.AreaMapper;
import com.sun.org.apache.xpath.internal.operations.Bool;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by buzheng on 18/1/15.
 * 服务实现类
 */
@Service("areaApi")
public class AreaApiImpl implements AreaApi {

    private Logger logger = LoggerFactory.getLogger(AreaApiImpl.class);

    @Autowired
    private AreaMapper areaMapper;

    @Override
    public List<Area> getAreas() {
        AreaQuery areaQuery = new AreaQuery();
        List<Area> areas = areaMapper.getAll();
        return areas;
    }

    @Override
    public Area getArea(Integer areaId) {
        Area area = new Area();
        if (areaId == null || areaId <= 0) {
            logger.error("the areaId cannot be empty");
            return area;
        }
        area = areaMapper.selectAreaByAreaId(areaId);
        return area;
    }

    @Override
    public List<Area> getAreaList(AreaQuery areaQuery) {
        List<Area> areas = new ArrayList<>();
        if (areaQuery == null) {
            logger.error("the areaQuery cannot be empty");
            return areas;
        }
        areas = areaMapper.selectArea(areaQuery);
        return areas;
    }

    @Override
    public boolean insertArea(AreaQuery areaQuery) {
        boolean result = false;
        if (areaQuery != null) {
            logger.error("the areaQuery cannot be empty");
        }
        int res = areaMapper.insert(areaQuery);
        if (res >= 1) {
            result = true;
        }
        return result;
    }

    @Override
    public boolean updateArea(AreaQuery areaQuery) {
        boolean result = false;
        if (areaQuery != null) {
            logger.error("the areaQuery cannot be empty");
        }
        int res = areaMapper.update(areaQuery);
        if (res >= 1) {
            result = true;
        }
        return result;
    }
}
