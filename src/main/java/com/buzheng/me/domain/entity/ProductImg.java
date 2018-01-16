package com.buzheng.me.domain.entity;

import lombok.Data;

@Data
public class ProductImg {
    private Integer productImgId;

    private String imgAddr;

    private String imgDesc;

    private Integer priority;

    private Integer createTime;

    private Integer productId;

    public ProductImg(Integer productImgId, String imgAddr, String imgDesc, Integer priority, Integer createTime, Integer productId) {
        this.productImgId = productImgId;
        this.imgAddr = imgAddr;
        this.imgDesc = imgDesc;
        this.priority = priority;
        this.createTime = createTime;
        this.productId = productId;
    }

}