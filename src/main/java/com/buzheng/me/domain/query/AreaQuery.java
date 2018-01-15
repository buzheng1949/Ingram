package com.buzheng.me.domain.query;

import lombok.Data;

import java.util.Date;

/**
 * Created by buzheng on 18/1/15.
 */
@Data
public class AreaQuery {
    private Integer areaId;

    private String areaName;

    private String areaDesc;

    private Integer priority;

    private Date createTime;

    private Date lastEditTime;
}
