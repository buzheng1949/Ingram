package com.buzheng.me.domain.entity;

import lombok.Data;

import java.util.Date;
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

}