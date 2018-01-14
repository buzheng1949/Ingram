package com.buzheng.me.domain;

import lombok.Data;

import java.util.Date;
@Data
public class ShopAuthMap {
    private Integer shopAuthId;

    private Integer employeeId;

    private Integer shopId;

    private String name;

    private String title;

    private Integer titleFlag;

    private Date createTime;

    private Date lastEditTime;

    private Integer enableStatus;
}