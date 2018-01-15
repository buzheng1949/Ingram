package com.buzheng.me.domain.entity;

import lombok.Data;

import java.util.Date;
@Data
public class Shop {
    private Integer shopId;

    private Integer ownerId;

    private Integer areaId;

    private Integer shopCategoryId;

    private Integer parentCategoryId;

    private String shopName;

    private String shopDesc;

    private String shopAddr;

    private String phone;

    private String shopImg;

    private Double longitude;

    private Double latitude;

    private Integer priority;

    private Integer createTime;

    private Integer lastEditTime;

    private Integer enableStatus;

    private String advice;

}