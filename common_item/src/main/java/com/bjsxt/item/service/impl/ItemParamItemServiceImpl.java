package com.bjsxt.item.service.impl;

import com.bjsxt.item.service.ItemParamItemService;
import com.bjsxt.mapper.TbItemParamItemMapper;
import com.bjsxt.pojo.TbItemParamItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 商品规格参数服务实现类
 * @author wuge
 * @date 2020/3/27
 */
@Service
public class ItemParamItemServiceImpl implements ItemParamItemService {

    /**
     * 注入ItemParamItemMapper
     */
    @Autowired
    private TbItemParamItemMapper itemParamItemMapper;

    @Override
    public Integer insertTbItemParamItem(TbItemParamItem tbItemParamItem) {
        return itemParamItemMapper.insert(tbItemParamItem);
    }
}
