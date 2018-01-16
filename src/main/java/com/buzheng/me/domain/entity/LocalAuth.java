package com.buzheng.me.domain.entity;

import lombok.Data;

@Data
public class LocalAuth {
    private Integer localAuthId;

    private Integer userId;

    private String userName;

    private String password;

    private Integer createTime;

    private Integer lastEditTime;

    public LocalAuth(Integer localAuthId, Integer userId, String userName, String password, Integer createTime, Integer lastEditTime) {
        this.localAuthId = localAuthId;
        this.userId = userId;
        this.userName = userName;
        this.password = password;
        this.createTime = createTime;
        this.lastEditTime = lastEditTime;
    }
}