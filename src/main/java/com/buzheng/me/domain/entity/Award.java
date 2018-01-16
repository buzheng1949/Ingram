package com.buzheng.me.domain.entity;

import lombok.Data;

@Data
public class Award {
    private Integer awardId;

    private String awardName;

    private String awardDesc;

    private String awardImg;

    private Integer point;

    private Integer priority;

    private Integer createTime;

    private Integer expireTime;

    private Integer lastEditTime;

    private Integer enableStatus;

    private Integer shopId;

    public Award(Integer awardId, String awardName, String awardDesc, String awardImg, Integer point, Integer priority, Integer createTime, Integer expireTime, Integer lastEditTime, Integer enableStatus, Integer shopId) {
        this.awardId = awardId;
        this.awardName = awardName;
        this.awardDesc = awardDesc;
        this.awardImg = awardImg;
        this.point = point;
        this.priority = priority;
        this.createTime = createTime;
        this.expireTime = expireTime;
        this.lastEditTime = lastEditTime;
        this.enableStatus = enableStatus;
        this.shopId = shopId;
    }

    public Award() {
        super();
    }

    public Integer getAwardId() {
        return awardId;
    }

    public void setAwardId(Integer awardId) {
        this.awardId = awardId;
    }

    public String getAwardName() {
        return awardName;
    }

    public void setAwardName(String awardName) {
        this.awardName = awardName == null ? null : awardName.trim();
    }

    public String getAwardDesc() {
        return awardDesc;
    }

    public void setAwardDesc(String awardDesc) {
        this.awardDesc = awardDesc == null ? null : awardDesc.trim();
    }

    public String getAwardImg() {
        return awardImg;
    }

    public void setAwardImg(String awardImg) {
        this.awardImg = awardImg == null ? null : awardImg.trim();
    }

    public Integer getPoint() {
        return point;
    }

    public void setPoint(Integer point) {
        this.point = point;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    public Integer getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Integer expireTime) {
        this.expireTime = expireTime;
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

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }
}