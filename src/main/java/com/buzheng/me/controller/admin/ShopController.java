package com.buzheng.me.controller.admin;

import com.buzheng.me.api.ShopApi;
import com.buzheng.me.builder.ShopBuilder;
import com.buzheng.me.context.ShopContext;
import com.buzheng.me.context.admin.AdminShopContext;
import com.buzheng.me.domain.action.ActionResult;
import com.buzheng.me.domain.action.Status;
import com.buzheng.me.domain.constant.ShopStatus;
import com.buzheng.me.domain.entity.Shop;
import com.buzheng.me.domain.query.ShopQuery;
import com.buzheng.me.domain.request.ShopRequest;
import com.buzheng.me.domain.vo.ShopVO;
import com.buzheng.me.domain.vo.admin.AdminShopVO;
import com.buzheng.me.utils.ParamUtil;
import com.buzheng.me.utils.TimeHelper;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by buzheng on 18/1/16.
 */
@RestController
@RequestMapping("/admin/shop")
public class ShopController {

    private Logger logger = LoggerFactory.getLogger(ShopController.class);

    @Autowired
    private ShopApi shopApi;

    @ResponseBody
    @RequestMapping("/register")
    public ActionResult<AdminShopVO> registerShop(ShopRequest shopRequest) {
        ActionResult<AdminShopVO> actionResult = new ActionResult<>();
        ShopQuery shopQuery = new ShopQuery();
        BeanUtils.copyProperties(shopRequest, shopQuery);
        boolean isValidQuery = isValidQuery(shopQuery);
        if (!isValidQuery) {
            actionResult = actionResult.of(Status.PARAM_IS_INVALID);
            actionResult.setSuccess(Boolean.FALSE);
            actionResult.setMessage("请输入合法参数");
            return actionResult;
        }
        AdminShopContext adminShopContext = shopApi.addShopInfo(shopQuery);
        ShopBuilder shopBuilder = new ShopBuilder();
        AdminShopVO adminShopVO = shopBuilder.buildAdminShopVO(adminShopContext);
        actionResult.setData(adminShopVO);
        actionResult.setMessage(adminShopVO.getShopStatus().getMessage());
        return actionResult;
    }

    @ResponseBody
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ActionResult<ShopVO> listShops(ShopRequest shopRequest) {
        ActionResult actionResult = new ActionResult<>();
        try {
            ShopQuery shopQuery = new ShopQuery();
            if (ParamUtil.isValidId(shopRequest.getShopId())) {
                shopQuery.setShopId(shopRequest.getShopId());
            }
            if (ParamUtil.isValidId(shopRequest.getAreaId())) {
                shopQuery.setAreaId(shopRequest.getAreaId());
            }
            if (ParamUtil.isValidId(shopRequest.getCategoryId())) {
                shopQuery.setShopCategoryId(shopRequest.getCategoryId());
            }
            List<Shop> shopList = shopApi.getShopList(shopQuery);
            ShopContext shopContext = new ShopContext();
            shopContext.setEnd(CollectionUtils.isEmpty(shopList));
            shopContext.setList(shopList);
            shopContext.setNow(shopRequest.getPage() == null ? 1 : shopRequest.getPage());
            ShopBuilder shopBuilder = new ShopBuilder();
            ShopVO shopVO = shopBuilder.buildShopVO(shopContext);
            actionResult = actionResult.of(Status.SUCCESS, shopVO);
        } catch (Exception e) {
            logger.error("the query shop is expection", e);
            actionResult = actionResult.of(Status.EXCEPTION);
        }
        return actionResult;
    }

    /**
     * 是否是有效的店铺query
     *
     * @param shopQuery
     * @return
     */
    boolean isValidQuery(ShopQuery shopQuery) {
        boolean result = Boolean.FALSE;
        if (shopQuery == null) {
            logger.error("the shop query is empty,please check the detail");
        } else if (!ParamUtil.isValidId(shopQuery.getShopId())) {
            logger.error("the shopId must not be empty");
        } else if (!ParamUtil.isValidId(shopQuery.getAreaId())) {
            logger.error("the areaId must not be empty");
        } else if (!ParamUtil.isValidId(shopQuery.getShopCategoryId())) {
            logger.error("the ShopCategoryId must not be empty");
        } else if (StringUtils.isEmpty(shopQuery.getShopName())) {
            logger.error("the shopName must not be empty");
        } else if (StringUtils.isEmpty(shopQuery.getShopDesc())) {
            logger.error("the shopDesc must not be empty");
        } else {
            result = Boolean.TRUE;
        }
        return result;
    }
}
