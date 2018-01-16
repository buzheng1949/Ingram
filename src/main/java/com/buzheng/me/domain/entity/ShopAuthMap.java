package com.buzheng.me.domain.entity;

import lombok.Data;

@Data
public class ShopAuthMap {
    private Integer shopAuthId;

    private Integer employeeId;

    private Integer shopId;

    private String name;

    private String title;

    private Integer titleFlag;

    private Integer createTime;

    private Integer lastEditTime;

    private Integer enableStatus;

    public ShopAuthMap(Integer shopAuthId, Integer employeeId, Integer shopId, String name, String title, Integer titleFlag, Integer createTime, Integer lastEditTime, Integer enableStatus) {
        this.shopAuthId = shopAuthId;
        this.employeeId = employeeId;
        this.shopId = shopId;
        this.name = name;
        this.title = title;
        this.titleFlag = titleFlag;
        this.createTime = createTime;
        this.lastEditTime = lastEditTime;
        this.enableStatus = enableStatus;
    }

}