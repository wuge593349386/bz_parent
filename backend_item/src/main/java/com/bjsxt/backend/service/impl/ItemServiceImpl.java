package com.bjsxt.backend.service.impl;

import com.bjsxt.backend.feign.CommonItemFeignClient;
import com.bjsxt.backend.service.ItemService;
import com.bjsxt.pojo.TbItem;
import com.bjsxt.pojo.TbItemDesc;
import com.bjsxt.pojo.TbItemParamItem;
import com.bjsxt.utils.IDUtils;
import com.bjsxt.utils.PageResult;
import com.bjsxt.utils.Result;
import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

/**
 * 服务实现类
 * @author wuge
 * @date 2020/3/30
 */
public class ItemServiceImpl implements ItemService {

    /**
     * 注入CommonItemFeignClient
     */
    @Autowired
    private CommonItemFeignClient commonItemFeignClient;

    @Override
    public Result selectTbItemAllByPage(Integer page, Integer rows) {
        PageResult pageResult = this.commonItemFeignClient.selectTbItemAllByPage(page, rows);
        if (pageResult != null && pageResult.getResult() != null &&
                pageResult.getResult().size() > 0) {
            return Result.ok(pageResult);
        }
        return Result.error("查无结果");
    }

    @LcnTransaction
    @Override
    public Result insertTbItem(TbItem tbItem, String desc, String itemParams) {
        // 补 齐 T b it e m 数 据
        Long itemId = IDUtils.genItemId();
        Date date = new Date();
        tbItem.setId(itemId);
        tbItem.setStatus((byte)1);
        tbItem.setUpdated(date);
        tbItem.setCreated(date);
        Integer tbItemNum = this.commonItemFeignClient.insertTbItem(tbItem);
        // 补 齐 商 品 描 述 对 象
        TbItemDesc tbItemDesc = new TbItemDesc();
        tbItemDesc.setItemId(itemId);
        tbItemDesc.setItemDesc(desc);
        tbItemDesc.setCreated(date);
        tbItemDesc.setUpdated(date);
        Integer tbitemDescNum = this.commonItemFeignClient.insertItemDesc(tbItemDesc);
        // 补 齐 商 品 规 格 参 数
        TbItemParamItem tbItemParamItem = new TbItemParamItem();
        tbItemParamItem.setItemId(itemId);
        tbItemParamItem.setParamData(itemParams);
        tbItemParamItem.setUpdated(date);
        tbItemParamItem.setCreated(date);
        Integer itemParamItmeNum = this.commonItemFeignClient.insertTbItemParamItem(tbItemParamItem);
        return Result.ok();

    }
}
