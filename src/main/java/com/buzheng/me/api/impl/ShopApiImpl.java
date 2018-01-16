package com.buzheng.me.api.impl;

import com.buzheng.me.api.ShopApi;
import com.buzheng.me.context.admin.AdminShopContext;
import com.buzheng.me.domain.constant.ShopStatus;
import com.buzheng.me.domain.entity.Shop;
import com.buzheng.me.domain.query.ShopQuery;
import com.buzheng.me.mapper.ShopMapper;
import com.buzheng.me.utils.ParamUtil;
import com.buzheng.me.utils.TimeHelper;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;
import java.util.List;

/**
 * Created by buzheng on 18/1/16.
 * 店铺操作服务
 */
@Service("shopApi")
public class ShopApiImpl implements ShopApi {


    @Autowired
    private ShopMapper shopMapper;

    private Logger logger = LoggerFactory.getLogger(ShopApiImpl.class);


    @Override
    public List<Shop> getShopList(ShopQuery shopQuery) {
        if (shopQuery == null) {
            logger.error("the shop query is empty,please check the detail");
            return Collections.emptyList();
        }
        List<Shop> shopList = shopMapper.query(shopQuery);
        return shopList;
    }

    @Override
    @Transactional
    public AdminShopContext addShopInfo(ShopQuery shopQuery) {
        if (shopQuery == null) {
            return new AdminShopContext(ShopStatus.PARAMS_EMPTY);
        }
        AdminShopContext adminShopContext = new AdminShopContext();
        try {
            boolean isValidQuery = isValidQuery(shopQuery);
            if (isValidQuery) {
                shopQuery.setEnableStatus(ShopStatus.CHECK.getStatus());
                shopQuery.setCreateTime(TimeHelper.getCurrentTime());
                shopQuery.setLastEditTime(TimeHelper.getCurrentTime());
                shopQuery.setAdvice(ShopStatus.CHECK.getMessage());
                int res = shopMapper.insert(shopQuery);
                if (res < 0) {
                    adminShopContext.setState(ShopStatus.ERROR.getStatus());
                    adminShopContext.setShopStatus(ShopStatus.ERROR);
                } else {
                    adminShopContext.setShopStatus(ShopStatus.CHECK);
                    adminShopContext.setState(ShopStatus.CHECK.getStatus());
                }
            }
        } catch (Exception e) {
            logger.error("insert the shop has meet expection", e);
            throw new RuntimeException(e);
        }
        return adminShopContext;
    }

    @Override
    public boolean updateShopInfo(ShopQuery shopQuery) {
        boolean result = Boolean.FALSE;
        Integer shopId = shopQuery.getShopId();
        if (!ParamUtil.isValidId(shopId)) {
            logger.error("the shopId cannot be empty");
            return result;
        }
        int res = shopMapper.update(shopQuery);
        result = res >= 1 ? Boolean.TRUE : Boolean.FALSE;
        return result;
    }

    /**
     * 是否是有效的店铺query
     *
     * @param shopQuery
     * @return
     */
    boolean isValidQuery(ShopQuery shopQuery) {
        boolean result = Boolean.FALSE;
        if (shopQuery == null) {
            logger.error("the shop query is empty,please check the detail");
        } else if (!ParamUtil.isValidId(shopQuery.getShopId())) {
            logger.error("the shopId must not be empty");
        } else if (!ParamUtil.isValidId(shopQuery.getAreaId())) {
            logger.error("the areaId must not be empty");
        } else if (!ParamUtil.isValidId(shopQuery.getShopCategoryId())) {
            logger.error("the ShopCategoryId must not be empty");
        } else if (StringUtils.isEmpty(shopQuery.getShopName())) {
            logger.error("the shopName must not be empty");
        } else if (StringUtils.isEmpty(shopQuery.getShopDesc())) {
            logger.error("the shopDesc must not be empty");
        } else {
            result = Boolean.TRUE;
        }
        return result;
    }
}
