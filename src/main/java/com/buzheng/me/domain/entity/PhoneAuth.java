package com.buzheng.me.domain.entity;

import lombok.Data;

@Data
public class PhoneAuth {
    private Integer phoneAuthId;

    private Integer userId;

    private String phone;

    private String authNumber;

    public PhoneAuth(Integer phoneAuthId, Integer userId, String phone, String authNumber) {
        this.phoneAuthId = phoneAuthId;
        this.userId = userId;
        this.phone = phone;
        this.authNumber = authNumber;
    }

}