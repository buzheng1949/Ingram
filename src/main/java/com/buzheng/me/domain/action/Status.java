package com.buzheng.me.domain.action;

import lombok.Getter;

/**
 * Created by buzheng on 18/1/15.
 * 返回状态枚举类
 */
public enum Status {
    SUCCESS(1001, "SUCCESS", Boolean.TRUE),
    PARAM_IS_INVALID(1002, "PARAM_IS_INVALID", Boolean.FALSE),
    EXCEPTION(1003, "EXPECTION", Boolean.FALSE);
    /**
     * 返回码
     */
    @Getter
    private Integer code;
    /**
     * 返回信息
     */
    @Getter
    private String message;
    /**
     * 是否成功
     */
    @Getter
    private boolean success;

    Status(Integer code, String message, boolean success) {
        this.code = code;
        this.message = message;
        this.success = success;
    }

}
