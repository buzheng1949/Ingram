package com.buzheng.me.domain.query;

import lombok.Data;

import java.util.Date;

/**
 * Created by buzheng on 18/1/15.
 */
@Data
public class AwardQuery {
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
