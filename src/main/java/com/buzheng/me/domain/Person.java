package com.buzheng.me.domain;

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

    public Person() {
        super();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getBirthday() {
        return birthday;
    }

    public void setBirthday(Integer birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getProfileImg() {
        return profileImg;
    }

    public void setProfileImg(String profileImg) {
        this.profileImg = profileImg == null ? null : profileImg.trim();
    }

    public Integer getCustomerFlag() {
        return customerFlag;
    }

    public void setCustomerFlag(Integer customerFlag) {
        this.customerFlag = customerFlag;
    }

    public Integer getShopOwnerFlag() {
        return shopOwnerFlag;
    }

    public void setShopOwnerFlag(Integer shopOwnerFlag) {
        this.shopOwnerFlag = shopOwnerFlag;
    }

    public Integer getAdminFlag() {
        return adminFlag;
    }

    public void setAdminFlag(Integer adminFlag) {
        this.adminFlag = adminFlag;
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    public Integer getLastEditTime() {
        return lastEditTime;
    }

    public void setLastEditTime(Integer lastEditTime) {
        this.lastEditTime = lastEditTime;
    }

    public Integer getEnableStatus() {
        return enableStatus;
    }

    public void setEnableStatus(Integer enableStatus) {
        this.enableStatus = enableStatus;
    }
}