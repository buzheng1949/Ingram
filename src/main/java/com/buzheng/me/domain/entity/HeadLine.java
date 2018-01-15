package com.buzheng.me.domain.entity;

import lombok.Data;

import java.util.Date;
@Data
public class HeadLine {
    private Integer lineId;

    private String lineName;

    private String lineLink;

    private String lineImg;

    private Integer priority;

    private Integer enableStatus;

    private Integer createTime;

    private Integer lastEditTime;

}