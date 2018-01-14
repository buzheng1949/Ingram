package com.buzheng.me.domain;

import lombok.Data;

import java.util.Date;
@Data
public class UserShopMap {
    private Integer userShopId;

    private Integer userId;

    private Integer shopId;

    private String userName;

    private String shopName;

    private Date createTime;

    private Integer point;

    public UserShopMap(Integer userShopId, Integer userId, Integer shopId, String userName, String shopName, Date createTime, Integer point) {
        this.userShopId = userShopId;
        this.userId = userId;
        this.shopId = shopId;
        this.userName = userName;
        this.shopName = shopName;
        this.createTime = createTime;
        this.point = point;
    }

}