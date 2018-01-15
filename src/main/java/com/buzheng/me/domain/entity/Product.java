package com.buzheng.me.domain.entity;

import lombok.Data;

import java.util.Date;
@Data
public class Product {
    private Integer productId;

    private String productName;

    private String productDesc;

    private String imgAddr;

    private String normalPrice;

    private String promotionPrice;

    private Integer priority;

    private Integer createTime;

    private Integer lastEditTime;

    private Integer enableStatus;

    private Integer point;

    private Integer productCategoryId;

    private Integer shopId;

}