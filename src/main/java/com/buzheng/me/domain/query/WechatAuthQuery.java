package com.buzheng.me.domain.query;

import lombok.Data;

import java.util.Date;

/**
 * Created by buzheng on 18/1/15.
 */
@Data
public class WechatAuthQuery {
    private Integer wechatAuthId;

    private Integer userId;

    private String openId;

    private Date createTime;
}
