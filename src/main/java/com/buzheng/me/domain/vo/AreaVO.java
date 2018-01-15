package com.buzheng.me.domain.vo;

import com.buzheng.me.domain.entity.Area;
import lombok.Data;

import java.util.List;

/**
 * Created by buzheng on 18/1/15.
 */
@Data
public class AreaVO {
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
    private Integer next;
}
