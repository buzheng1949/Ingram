package com.buzheng.me.domain.query;

import lombok.Data;

import java.util.Date;

/**
 * Created by buzheng on 18/1/15.
 */
@Data
public class UserShopMapQuery {
    private Integer userShopId;

    private Integer userId;

    private Integer shopId;

    private String userName;

    private String shopName;

    private Date createTime;

    private Integer point;
}
