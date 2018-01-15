package com.buzheng.me.domain.entity;

import lombok.Data;

import java.util.Date;
@Data
public class ProductCategory {
    private Integer productCategoryId;

    private String productCategoryName;

    private String productCategoryDesc;

    private Integer priority;

    private Integer createTime;

    private Integer lastEditTime;

    private Integer shopId;

}