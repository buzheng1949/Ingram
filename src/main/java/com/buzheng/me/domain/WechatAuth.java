package com.buzheng.me.domain;

import lombok.Data;

import java.util.Date;
@Data
public class WechatAuth {
    private Integer wechatAuthId;

    private Integer userId;

    private String openId;

    private Date createTime;

    public WechatAuth(Integer wechatAuthId, Integer userId, String openId, Date createTime) {
        this.wechatAuthId = wechatAuthId;
        this.userId = userId;
        this.openId = openId;
        this.createTime = createTime;
    }
}