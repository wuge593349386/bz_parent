package com.bjsxt.backend.service;

import com.bjsxt.utils.Result;

/**
 * 商品类目服务
 * @author wuge
 * @date 2020/3/30
 */
public interface ItemCategoryService {

    /**
     * 分页查询商品
     * @param id
     * @return
     */
    Result selectItemCategoryByParentId(Long id);
}
