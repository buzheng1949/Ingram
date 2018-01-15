package com.buzheng.me.domain.query;

import lombok.Data;

import java.util.Date;

/**
 * Created by buzheng on 18/1/15.
 */
@Data
public class ShopAuthMapQuery {
    private Integer shopAuthId;

    private Integer employeeId;

    private Integer shopId;

    private String name;

    private String title;

    private Integer titleFlag;

    private Integer createTime;

    private Integer lastEditTime;

    private Integer enableStatus;
}
