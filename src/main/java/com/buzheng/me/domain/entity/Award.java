package com.buzheng.me.domain.entity;

import lombok.Data;

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

    public Award(Integer awardId, String awardName, String awardDesc, String awardImg, Integer point, Integer priority, Integer createTime, Integer expireTime, Integer lastEditTime, Integer enableStatus, Integer shopId) {
        this.awardId = awardId;
        this.awardName = awardName;
        this.awardDesc = awardDesc;
        this.awardImg = awardImg;
        this.point = point;
        this.priority = priority;
        this.createTime = createTime;
        this.expireTime = expireTime;
        this.lastEditTime = lastEditTime;
        this.enableStatus = enableStatus;
        this.shopId = shopId;
    }

}