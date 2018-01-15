package com.buzheng.me.context;

import com.buzheng.me.domain.entity.Area;
import lombok.Data;

import java.util.List;

/**
 * Created by buzheng on 18/1/15.
 * 区域信息透出上下文
 */
@Data
public class AreaContext {
    /**
     * 列表
     */
    private List<Area> list;

    /**
     * 是否最后一页
     */
    private boolean isEnd;

    /**
     * 下一页页码
     */
    private Integer now;
}
