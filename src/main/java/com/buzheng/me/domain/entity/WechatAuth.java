package com.buzheng.me.domain.entity;

import lombok.Data;

import java.util.Date;
@Data
public class WechatAuth {
    private Integer wechatAuthId;

    private Integer userId;

    private String openId;

    private Integer createTime;

}