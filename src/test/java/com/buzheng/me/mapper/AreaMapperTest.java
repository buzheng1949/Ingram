package com.buzheng.me.mapper;

import com.buzheng.me.domain.Area;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

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
        Area area = new Area();
        area.setAreaId(3);
        area.setAreaName("东苑");
        area.setPriority(12);
        Area result = areaMapper.selectArea(area);
        if (result == null){
            logger.error("the select is error");
        }

    }

}