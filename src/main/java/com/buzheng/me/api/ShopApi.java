package com.buzheng.me.api;

import com.buzheng.me.domain.entity.Shop;
import com.buzheng.me.domain.query.ShopQuery;

import java.util.List;

/**
 * Created by buzheng on 18/1/16.
 */
public interface ShopApi {

    /**
     * 获取店铺列表
     *
     * @param shopQuery
     * @return
     */
    List<Shop> getShopList(ShopQuery shopQuery);

    /**
     * 增加店铺信息
     *
     * @param shopQuery
     * @return
     */
    boolean addShopInfo(ShopQuery shopQuery);

    /**
     * 更新店铺信息
     *
     * @param shopQuery
     * @return
     */
    boolean updateShopInfo(ShopQuery shopQuery);
}

