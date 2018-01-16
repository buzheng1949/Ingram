package com.buzheng.me.builder;

import com.buzheng.me.context.ShopContext;
import com.buzheng.me.domain.vo.ShopVO;
import org.springframework.stereotype.Component;

/**
 * Created by buzheng on 18/1/16.
 */
@Component
public class ShopBuilder {
    /**
     * 构建对外透出VO
     *
     * @param shopContext
     * @return
     */
    public ShopVO buildShopVO(ShopContext shopContext) {
        ShopVO shopVO = new ShopVO();
        shopVO.setList(shopContext.getList());
        shopVO.setEnd(shopContext.isEnd());
        shopVO.setNext(shopContext.getNow() + 1);
        return shopVO;
    }

}
