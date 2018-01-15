package com.buzheng.me.domain.entity;

import lombok.Data;

import java.util.Date;
@Data
public class Award {
    private Integer awardId;

    private String awardName;

    private String awardDesc;

    private String awardImg;

    private Integer point;

    private Integer priority;

    private Integer createTime;

    private Integer expireTime;

    private Integer lastEditTime;

    private Integer enableStatus;

    private Integer shopId;
}