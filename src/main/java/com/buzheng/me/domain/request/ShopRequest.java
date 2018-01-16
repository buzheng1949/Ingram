package com.buzheng.me.domain.request;

import lombok.Data;

/**
 * Created by buzheng on 18/1/16.
 */
@Data
public class ShopRequest {
    /**
     * 请求页码
     */
    private Integer page;
    /**
     * 请求页数
     */
    private Integer pageSize;
    /**
     * 店铺ID
     */
    private Integer shopId;
    /**
     * 店铺所属类目ID
     */
    private Integer categoryId;
    /**
     * 店铺所在区域ID
     */
    private Integer areaId;

    private Integer ownerId;

    private Integer shopCategoryId;

    private Integer parentCategoryId;

    private String shopName;

    private String shopDesc;

    private String shopAddr;

    private String phone;

    private String shopImg;

    private Double longitude;

    private Double latitude;

    private Integer priority;

}
