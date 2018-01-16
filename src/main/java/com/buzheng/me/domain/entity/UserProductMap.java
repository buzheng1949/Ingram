package com.buzheng.me.domain.entity;

import lombok.Data;

@Data
public class UserProductMap {
    private Integer userProductId;

    private Integer userId;

    private Integer productId;

    private Integer shopId;

    private String userName;

    private String productName;

    private Integer createTime;

    private Integer point;

    public UserProductMap(Integer userProductId, Integer userId, Integer productId, Integer shopId, String userName, String productName, Integer createTime, Integer point) {
        this.userProductId = userProductId;
        this.userId = userId;
        this.productId = productId;
        this.shopId = shopId;
        this.userName = userName;
        this.productName = productName;
        this.createTime = createTime;
        this.point = point;
    }

}