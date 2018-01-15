package com.buzheng.me.domain.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Area {
    private Integer areaId;

    private String areaName;

    private String areaDesc;

    private Integer priority;

    private Integer createTime;

    private Integer lastEditTime;

}