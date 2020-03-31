package com.bjsxt.item.service;

import com.bjsxt.pojo.TbItemDesc;

/**
 * 商品描述服务
 * @author wuge
 * @date 2020/3/27
 */
public interface ItemDescService {

    /**
     * 插入商品
     * @param tbItemDesc
     * @return
     */
    Integer insertTbItemDesc(TbItemDesc tbItemDesc);
}
