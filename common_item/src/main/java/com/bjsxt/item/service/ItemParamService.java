package com.bjsxt.item.service;

import com.bjsxt.pojo.TbItemCat;
import com.bjsxt.pojo.TbItemParam;

import java.util.List;

/**
 * 商品参数服务
 * @author wuge
 * @date 2020/3/30
 */
public interface ItemParamService {

    /**
     * 查询商品参数
     * @param itemCatId
     * @return
     */
    TbItemParam selectItemParamByItemCatId(Long itemCatId);
}
