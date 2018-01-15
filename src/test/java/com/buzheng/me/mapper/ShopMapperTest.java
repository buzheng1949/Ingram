package com.buzheng.me.mapper;

import com.buzheng.me.domain.entity.Shop;
import com.buzheng.me.domain.query.ShopQuery;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by buzheng on 18/1/16.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ShopMapperTest {

    @Autowired
    private ShopMapper shopMapper;

    @Test
    public void insert() throws Exception {
        ShopQuery shopQuery = new ShopQuery();
        shopQuery.setShopId(1);
        shopQuery.setAreaId(1);
        shopQuery.setShopCategoryId(1);
        shopQuery.setParentCategoryId(2);
        shopQuery.setPhone("1111");
        shopQuery.setAdvice("审核中");
        shopQuery.setEnableStatus(1);
        shopQuery.setLatitude(1.0);
        shopQuery.setLongitude(1.0);
        shopQuery.setOwnerId(1);
        shopQuery.setShopName("一点点");
        shopQuery.setShopImg("http://www.xxx.com/img");
        shopQuery.setShopDesc("一点都不贵");
        shopQuery.setShopAddr("杭州西湖");
        shopQuery.setPriority(1);
        int res = shopMapper.insert(shopQuery);
        if (res != 1) {
            throw new RuntimeException("failed");
        }

    }

    @Test
    public void update() throws Exception {
        ShopQuery shopQuery = new ShopQuery();
        shopQuery.setShopId(1);
        shopQuery.setAreaId(1);
        shopQuery.setShopCategoryId(1);
        shopQuery.setParentCategoryId(2);
        shopQuery.setPhone("10086");
        shopQuery.setAdvice("审核中");
        shopQuery.setEnableStatus(1);
        shopQuery.setLatitude(1.0);
        shopQuery.setLongitude(1.0);
        shopQuery.setOwnerId(1);
        shopQuery.setShopName("一点点");
        shopQuery.setShopImg("http://www.xxx.com/img");
        shopQuery.setShopDesc("一点都不贵");
        shopQuery.setShopAddr("杭州西湖");
        shopQuery.setPriority(1);
        int res = shopMapper.update(shopQuery);
        if (res != 1) {
            throw new RuntimeException("failed");
        }
    }

    @Test
    public void query() throws Exception {
        ShopQuery shopQuery = new ShopQuery();
        shopQuery.setShopId(1);
        List<Shop> res = shopMapper.query(shopQuery);
        if (res.size() <= 0){
            throw new RuntimeException("failed");
        }
    }

}