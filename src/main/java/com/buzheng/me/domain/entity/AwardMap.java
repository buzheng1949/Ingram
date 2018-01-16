package com.buzheng.me.domain.entity;

import lombok.Data;

@Data
public class AwardMap {
    private Integer userAwardId;

    private Integer userId;

    private Integer awardId;

    private Integer shopId;

    private String userName;

    private String awardName;

    private Integer expireTime;

    private Integer createTime;

    private Integer usedStatus;

    private Integer point;

    public AwardMap(Integer userAwardId, Integer userId, Integer awardId, Integer shopId, String userName, String awardName, Integer expireTime, Integer createTime, Integer usedStatus, Integer point) {
        this.userAwardId = userAwardId;
        this.userId = userId;
        this.awardId = awardId;
        this.shopId = shopId;
        this.userName = userName;
        this.awardName = awardName;
        this.expireTime = expireTime;
        this.createTime = createTime;
        this.usedStatus = usedStatus;
        this.point = point;
    }
}