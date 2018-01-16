package com.buzheng.me.mapper;

import com.buzheng.me.domain.entity.HeadLine;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by buzheng on 18/1/16.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class HeadLineMapperTest {

    @Autowired
    private HeadLineMapper mapper;

    @Test
    public  void test(){
        if(mapper == null){
            throw new RuntimeException("null mapper");
        }
        HeadLine headLine = mapper.selectByPrimaryKey(1);
    }

}