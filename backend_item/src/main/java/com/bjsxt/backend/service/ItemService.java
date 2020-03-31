package com.bjsxt.backend.service;

import com.bjsxt.pojo.TbItem;
import com.bjsxt.utils.Result;

/**
 * @author wuge
 * @date 2020/3/30
 */
public interface ItemService {

    /**
     * 分页查询商品
     * @param page
     * @param rows
     * @return
     */
    Result selectTbItemAllByPage(Integer page, Integer rows);

    /**
     * 添加商品
     * @param tbItem
     * @param desc
     * @param itemParams
     * @return
     */
    Result insertTbItem(TbItem tbItem, String desc, String itemParams);
}
