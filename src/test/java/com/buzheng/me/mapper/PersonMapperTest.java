package com.buzheng.me.mapper;

import com.buzheng.me.domain.entity.Person;
import com.buzheng.me.domain.query.PersonQuery;
import com.buzheng.me.utils.TimeHelper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by buzheng on 18/1/15.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PersonMapperTest {

    Logger logger = LoggerFactory.getLogger(PersonMapperTest.class);

    @Autowired
    private PersonMapper personMapper;


    @Test
    public void insert() throws Exception {
        PersonQuery personQuery = new PersonQuery();
        personQuery.setAdminFlag(1);
        personQuery.setBirthday(TimeHelper.getCurrentTime());
        personQuery.setCreateTime(TimeHelper.getCurrentTime());
        personQuery.setLastEditTime(TimeHelper.getCurrentTime());
        personQuery.setEmail("yupeibiao@gmail.com");
        personQuery.setEnableStatus(1);
        personQuery.setGender("测试");
        personQuery.setPhone("15521104715");
        personQuery.setUserId(personQuery.getPhone().hashCode());
        personQuery.setName("不正");
        personQuery.setCustomerFlag(1);
        personQuery.setShopOwnerFlag(1);
        personQuery.setProfileImg("https://xxxxx.img");
        int res = personMapper.insert(personQuery);
        if (res != 1) {
            throw new RuntimeException("the sql excute failed");
        }

    }

    @Test
    public void query() throws Exception {
        PersonQuery personQuery = new PersonQuery();
        personQuery.setPhone("15521104715");
        Person person = personMapper.query(personQuery);
        if (person == null) {
            logger.error("the query is not match anyone");
        }
    }

}