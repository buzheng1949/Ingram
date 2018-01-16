package com.buzheng.me.domain.constant;

import com.buzheng.me.domain.entity.Shop;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by buzheng on 18/1/16.
 * 店铺状态枚举类
 */
public enum ShopStatus {
    CHECK(1001, "店铺审核中"),
    ILLEGAL(1002, "非法店铺"),
    SUCCESS(1003, "操作成功"),
    PASS(1004, "认证通过"),
    ERROR(1005, "内部异常");

    /**
     * 店铺状态值
     */
    @Getter
    @Setter
    private Integer status;


    /**
     * 信息
     */
    @Getter
    @Setter
    private String message;

    private ShopStatus(Integer status, String message) {
        this.status = status;
        this.message = message;
    }

    /**
     * 根据status获取枚举值
     *
     * @param status
     * @return
     * @see ShopStatus
     */
    public static ShopStatus statusOf(int status) {
        ShopStatus matchStatus = ShopStatus.ERROR;
        for (ShopStatus shopStatus : values()) {
            if (shopStatus.status == status) {
                matchStatus = shopStatus;
                break;
            }
        }
        return matchStatus;
    }
}
