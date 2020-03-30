package com.bjsxt.item.service;

import com.bjsxt.pojo.TbItemCat;

import java.util.List;

/**
 * 商品类目服务
 * @author wuge
 * @date 2020/3/30
 */
public interface ItemCategoryService {

    /**
     * 查询商品类目
     * @param id
     * @return
     */
    public List<TbItemCat> selectItemCategoryByParentId(Long id);
}
