package com.bjsxt.item.service.impl;

import com.bjsxt.item.service.ItemDescService;
import com.bjsxt.mapper.TbItemDescMapper;
import com.bjsxt.pojo.TbItemDesc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 商品描述服务实现类
 * @author wuge
 * @date 2020/3/27
 */
@Service
public class ItemDescServiceImpl implements ItemDescService {

    /**
     * 注入TbItemDescMapper
     */
    @Autowired
    private TbItemDescMapper tbItemDescMapper;

    @Override
    public Integer insertTbItemDesc(TbItemDesc tbItemDesc) {
        return this.tbItemDescMapper.insert(tbItemDesc);
    }
}
