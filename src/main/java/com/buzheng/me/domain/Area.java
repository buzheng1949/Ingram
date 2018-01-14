package com.buzheng.me.domain;

import lombok.Data;

import java.util.Date;

@Data
public class Area {
    private Integer areaId;

    private String areaName;

    private String areaDesc;

    private Integer priority;

    private Date createTime;

    private Date lastEditTime;

}