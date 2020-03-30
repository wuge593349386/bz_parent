package com.bjsxt.backend.service;

import com.bjsxt.utils.Result;

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
    Result selectItemParamByItemCatId(Long itemCatId);
}
