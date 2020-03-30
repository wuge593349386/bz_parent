package com.bjsxt.item.service.impl;

import com.bjsxt.item.service.ItemCategoryService;
import com.bjsxt.item.service.ItemParamService;
import com.bjsxt.mapper.TbItemCatMapper;
import com.bjsxt.mapper.TbItemParamMapper;
import com.bjsxt.pojo.TbItemCat;
import com.bjsxt.pojo.TbItemCatExample;
import com.bjsxt.pojo.TbItemParam;
import com.bjsxt.pojo.TbItemParamExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 商品参数服务实现类
 * @author wuge
 * @date 2020/3/30
 */
@Service
public class ItemParamServiceImpl implements ItemParamService {

    /**
     * 注入TbItemParamMapper
     */
    @Autowired
    private TbItemParamMapper tbItemParamMapper;

    @Override
    public TbItemParam selectItemParamByItemCatId(Long itemCatId) {
        TbItemParamExample example = new TbItemParamExample();
        TbItemParamExample.Criteria criteria = example.createCriteria();
        criteria.andItemCatIdEqualTo(itemCatId);
        List<TbItemParam> list = this.tbItemParamMapper.selectByExampleWithBLOBs(example);
        if (list != null && list.size() > 0) {
            return list.get(0);
        }
        return null;
    }

}
