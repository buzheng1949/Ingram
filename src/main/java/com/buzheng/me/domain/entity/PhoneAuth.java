package com.buzheng.me.domain.entity;

import lombok.Data;

@Data
public class PhoneAuth {
    private Integer phoneAuthId;

    private Integer userId;

    private String phone;

    private String authNumber;
}