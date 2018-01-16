package com.buzheng.me.context;

import com.buzheng.me.domain.entity.Area;
import com.buzheng.me.domain.entity.Shop;
import lombok.Data;

import java.util.List;

/**
 * Created by buzheng on 18/1/16.
 */
@Data
public class ShopContext {
    /**
     * 列表
     */
    private List<Shop> list;

    /**
     * 是否最后一页
     */
    private boolean isEnd;

    /**
     * 下一页页码
     */
    private Integer now;
}
