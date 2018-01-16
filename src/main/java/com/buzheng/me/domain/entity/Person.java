package com.buzheng.me.domain.entity;

import lombok.Data;

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

    public Person(Integer userId, String name, Integer birthday, String gender, String phone, String email, String profileImg, Integer customerFlag, Integer shopOwnerFlag, Integer adminFlag, Integer createTime, Integer lastEditTime, Integer enableStatus) {
        this.userId = userId;
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.phone = phone;
        this.email = email;
        this.profileImg = profileImg;
        this.customerFlag = customerFlag;
        this.shopOwnerFlag = shopOwnerFlag;
        this.adminFlag = adminFlag;
        this.createTime = createTime;
        this.lastEditTime = lastEditTime;
        this.enableStatus = enableStatus;
    }

}