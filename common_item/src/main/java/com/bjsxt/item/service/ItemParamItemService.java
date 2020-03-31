package com.bjsxt.item.service;

import com.bjsxt.pojo.TbItemParamItem;

/**
 * 商品规格参数服务
 * @author wuge
 * @date 2020/3/27
 */
public interface ItemParamItemService {

    /**
     * 插入商品规格参数
     * @param tbItemParamItem
     * @return
     */
    Integer insertTbItemParamItem(TbItemParamItem tbItemParamItem);
}
