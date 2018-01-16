package com.buzheng.me.domain.entity;

import lombok.Data;

@Data
public class UserShopMap {
    private Integer userShopId;

    private Integer userId;

    private Integer shopId;

    private String userName;

    private String shopName;

    private Integer createTime;

    private Integer point;

    public UserShopMap(Integer userShopId, Integer userId, Integer shopId, String userName, String shopName, Integer createTime, Integer point) {
        this.userShopId = userShopId;
        this.userId = userId;
        this.shopId = shopId;
        this.userName = userName;
        this.shopName = shopName;
        this.createTime = createTime;
        this.point = point;
    }

    public UserShopMap() {
        super();
    }
}