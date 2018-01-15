package com.buzheng.me.builder;

import com.buzheng.me.context.AreaContext;
import com.buzheng.me.domain.entity.Area;
import com.buzheng.me.domain.vo.AreaVO;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by buzheng on 18/1/15.
 */
@Component
public class AreaBuilder {

    /**
     * 构建区域信息类
     *
     * @param areaContext
     * @return
     */
    public AreaVO assembleAreaVO(AreaContext areaContext) {
        AreaVO areaVO = new AreaVO();
        if (null == areaContext) {
            return areaVO;
        }
        List<Area> list = areaContext.getList();
        boolean isEnd = areaContext.isEnd();
        Integer nextPage = areaContext.getNow() + 1;
        areaVO.setList(list);
        areaVO.setEnd(isEnd);
        areaVO.setNext(nextPage);
        return areaVO;
    }
}
