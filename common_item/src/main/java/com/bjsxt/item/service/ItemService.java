package com.bjsxt.item.service;

import com.bjsxt.utils.PageResult;

/**
 * 商品服务
 * @author wuge
 * @date 2020/3/27
 */
public interface ItemService {

    /**
     * 查询商品数据
     * @param page
     * @param rows
     * @return
     */
    PageResult selectTbItemAllByPage(Integer page, Integer rows);
}
