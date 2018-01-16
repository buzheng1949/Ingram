package com.buzheng.me.domain.entity;

import lombok.Data;

@Data
public class WechatAuth {
    private Integer wechatAuthId;

    private Integer userId;

    private String openId;

    private Integer createTime;

    public WechatAuth(Integer wechatAuthId, Integer userId, String openId, Integer createTime) {
        this.wechatAuthId = wechatAuthId;
        this.userId = userId;
        this.openId = openId;
        this.createTime = createTime;
    }

}