package com.buzheng.me.mapper;

import com.buzheng.me.domain.entity.Area;
import com.buzheng.me.domain.query.AreaQuery;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.Date;

/**
 * Created by buzheng on 18/1/15.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AreaMapperTest {

    private Logger logger = LoggerFactory.getLogger(AreaMapperTest.class);

    @Resource
    private AreaMapper areaMapper;

    @Test
    public void selectByPrimaryKey() throws Exception {
        AreaQuery area = new AreaQuery();
        area.setAreaId(1);
        area.setAreaName("北京");
        area.setPriority(1);
        Area result = areaMapper.selectArea(area);
        if (result == null) {
            logger.error("the select is error");
        }

    }

    @Test
    public void insert() {
        AreaQuery areaQuery = new AreaQuery();
        areaQuery.setPriority(12);
        areaQuery.setAreaDesc("广州");
        areaQuery.setAreaName("广州");
        Long time = System.currentTimeMillis()/1000;
        areaQuery.setCreateTime(Integer.valueOf(String.valueOf(time)));
        areaQuery.setLastEditTime(Integer.valueOf(String.valueOf(time)));
        int res = areaMapper.insert(areaQuery);
        if (res != 1) {
            throw new RuntimeException("the insert test is failed");
        }
    }

}