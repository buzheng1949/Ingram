package com.buzheng.me.context.admin;

import com.buzheng.me.domain.constant.ShopStatus;
import com.buzheng.me.domain.entity.Shop;
import lombok.Data;

/**
 * Created by buzheng on 18/1/16.
 */
@Data
public class AdminShopContext {
    /**
     * 店铺状态
     */
    private Integer state;

    /**
     * 店铺状态枚举
     */
    private ShopStatus shopStatus;

    public AdminShopContext(Integer state, ShopStatus shopStatus) {
        this.state = state;
        this.shopStatus = shopStatus;
    }

    public AdminShopContext(ShopStatus shopStatus) {
        this.shopStatus = shopStatus;
    }

    public AdminShopContext() {
    }
}
