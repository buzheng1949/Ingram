package com.buzheng.me.domain.entity;

import lombok.Data;

@Data
public class ProductCategory {
    private Integer productCategoryId;

    private String productCategoryName;

    private String productCategoryDesc;

    private Integer priority;

    private Integer createTime;

    private Integer lastEditTime;

    private Integer shopId;

    public ProductCategory(Integer productCategoryId, String productCategoryName, String productCategoryDesc, Integer priority, Integer createTime, Integer lastEditTime, Integer shopId) {
        this.productCategoryId = productCategoryId;
        this.productCategoryName = productCategoryName;
        this.productCategoryDesc = productCategoryDesc;
        this.priority = priority;
        this.createTime = createTime;
        this.lastEditTime = lastEditTime;
        this.shopId = shopId;
    }

}