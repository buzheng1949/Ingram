package com.buzheng.me.domain.entity;

import lombok.Data;

import java.util.Date;
@Data
public class Person {
    private Integer userId;

    private String name;

    private Integer birthday;

    private String gender;

    private String phone;

    private String email;

    private String profileImg;

    private Integer customerFlag;

    private Integer shopOwnerFlag;

    private Integer adminFlag;

    private Integer createTime;

    private Integer lastEditTime;

    private Integer enableStatus;

}