package com.buzheng.me.domain;

import lombok.Data;

import java.util.Date;
@Data
public class ProductImg {
    private Integer productImgId;

    private String imgAddr;

    private String imgDesc;

    private Integer priority;

    private Date createTime;

    private Integer productId;
}