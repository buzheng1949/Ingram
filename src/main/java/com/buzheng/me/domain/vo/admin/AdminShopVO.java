package com.buzheng.me.domain.vo.admin;

import com.buzheng.me.domain.constant.ShopStatus;
import com.buzheng.me.domain.entity.Shop;
import lombok.Data;

/**
 * Created by buzheng on 18/1/16.
 * 店铺创建对对后台管理系统的VO
 */
@Data
public class AdminShopVO {

    /**
     * 店铺状态
     */
    private Integer state;

    /**
     * 店铺状态枚举
     */
    private ShopStatus shopStatus;


}
