package com.buzheng.me.domain.entity;

import lombok.Data;

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

    public HeadLine(Integer lineId, String lineName, String lineLink, String lineImg, Integer priority, Integer enableStatus, Integer createTime, Integer lastEditTime) {
        this.lineId = lineId;
        this.lineName = lineName;
        this.lineLink = lineLink;
        this.lineImg = lineImg;
        this.priority = priority;
        this.enableStatus = enableStatus;
        this.createTime = createTime;
        this.lastEditTime = lastEditTime;
    }
}