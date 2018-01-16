package com.buzheng.me.domain.entity;

import lombok.Data;

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

    public Product(Integer productId, String productName, String productDesc, String imgAddr, String normalPrice, String promotionPrice, Integer priority, Integer createTime, Integer lastEditTime, Integer enableStatus, Integer point, Integer productCategoryId, Integer shopId) {
        this.productId = productId;
        this.productName = productName;
        this.productDesc = productDesc;
        this.imgAddr = imgAddr;
        this.normalPrice = normalPrice;
        this.promotionPrice = promotionPrice;
        this.priority = priority;
        this.createTime = createTime;
        this.lastEditTime = lastEditTime;
        this.enableStatus = enableStatus;
        this.point = point;
        this.productCategoryId = productCategoryId;
        this.shopId = shopId;
    }

}