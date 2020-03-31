package com.bjsxt.item.service.impl;

import com.bjsxt.item.service.ItemService;
import com.bjsxt.mapper.TbItemMapper;
import com.bjsxt.pojo.TbItem;
import com.bjsxt.pojo.TbItemExample;
import com.bjsxt.utils.PageResult;
import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 商品服务实现类
 * @author wuge
 * @date 2020/3/27
 */
@Service
public class ItemServiceImpl implements ItemService {

    /**
     * 注入tbItemMapper
     */
    @Autowired
    private TbItemMapper tbItemMapper;


    @Override
    public PageResult selectTbItemAllByPage(Integer page, Integer rows) {
        PageHelper.startPage(page,rows);
        TbItemExample example = new TbItemExample();
        TbItemExample.Criteria criteria = example.createCriteria();
        criteria.andStatusEqualTo((byte)1);
        List<TbItem> list = this.tbItemMapper.selectByExample(example);
        PageInfo<TbItem> pageInfo = new PageInfo<>(list);
        PageResult result = new PageResult();
        result.setPageIndex(page);
        result.setTotalPage(pageInfo.getTotal());
        result.setResult(list);
        return result;
    }

    @LcnTransaction
    @Override
    public Integer insertTbItem(TbItem tbItem) {
        return this.tbItemMapper.insert(tbItem);
    }
}
