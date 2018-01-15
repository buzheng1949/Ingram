package com.buzheng.me.domain.query;

import lombok.Data;

import java.util.Date;

/**
 * Created by buzheng on 18/1/15.
 */
@Data
public class ProductImgQuery {
    private Integer productImgId;

    private String imgAddr;

    private String imgDesc;

    private Integer priority;

    private Integer createTime;

    private Integer productId;
}
