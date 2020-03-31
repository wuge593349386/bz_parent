package com.bjsxt.item.service;

import com.bjsxt.pojo.TbItem;
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

    /**
     * 插入商品
     * @param tbItem
     * @return
     */
    Integer insertTbItem(TbItem tbItem);
}
