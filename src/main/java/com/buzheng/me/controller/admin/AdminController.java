package com.buzheng.me.controller.admin;

import com.buzheng.me.api.AreaApi;
import com.buzheng.me.builder.AreaBuilder;
import com.buzheng.me.context.AreaContext;
import com.buzheng.me.domain.action.ActionResult;
import com.buzheng.me.domain.action.Status;
import com.buzheng.me.domain.entity.Area;
import com.buzheng.me.domain.query.AreaQuery;
import com.buzheng.me.domain.request.AreaQuest;
import com.buzheng.me.domain.vo.AreaVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by buzheng on 18/1/15.
 */
@RestController
@RequestMapping("/admin/area/")
public class AdminController {

    @Autowired
    private AreaApi areaApi;

    private Logger logger = LoggerFactory.getLogger(AdminController.class);

    /**
     * 区域列表查询接口
     *
     * @param areaQuest
     * @return
     */
    @RequestMapping(value = "list", method = RequestMethod.GET)
    @ResponseBody
    public ActionResult<AreaVO> list(AreaQuest areaQuest) {
        ActionResult actionResult = new ActionResult<>();
        AreaQuery areaQuery = new AreaQuery();
        try {
            if (areaQuest.getAreaId() != null) {
                areaQuery.setAreaId(areaQuest.getAreaId());
            }
            List<Area> areaList = areaApi.getAreaList(areaQuery);
            AreaContext areaContext = new AreaContext();
            areaContext.setList(areaList);
            areaContext.setEnd(areaList.size() == 0);
            areaContext.setNow(areaQuest.getPage() == null ? 1 : areaQuest.getPage());
            AreaBuilder areaBuilder = new AreaBuilder();
            AreaVO areaVO = areaBuilder.assembleAreaVO(areaContext);
            actionResult = actionResult.of(Status.SUCCESS, areaVO);
        } catch (Exception e) {
            logger.error("query the area list is exception", e);
            actionResult = actionResult.of(Status.EXCEPTION);
        }
        return actionResult;

    }
}
