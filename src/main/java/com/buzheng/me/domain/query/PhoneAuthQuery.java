package com.buzheng.me.domain.query;

import lombok.Data;

/**
 * Created by buzheng on 18/1/15.
 */
@Data
public class PhoneAuthQuery {
    private Integer phoneAuthId;

    private Integer userId;

    private String phone;

    private String authNumber;
}
