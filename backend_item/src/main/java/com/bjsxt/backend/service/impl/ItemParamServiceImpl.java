package com.bjsxt.backend.service.impl;

import com.bjsxt.backend.feign.CommonItemFeignClient;
import com.bjsxt.backend.service.ItemCategoryService;
import com.bjsxt.backend.service.ItemParamService;
import com.bjsxt.pojo.TbItemCat;
import com.bjsxt.pojo.TbItemParam;
import com.bjsxt.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 服务实现类
 * @author wuge
 * @date 2020/3/30
 */
@Service
public class ItemParamServiceImpl implements ItemParamService {

    /**
     * 注入CommonItemFeignClient
     */
    @Autowired
    private CommonItemFeignClient commonItemFeignClient;

    @Override
    public Result selectItemParamByItemCatId(Long itemCatId) {
        TbItemParam tbItemParam = this.commonItemFeignClient.selectItemParamByItemCatId(itemCatId);
        if(tbItemParam != null){
            return Result.ok(tbItemParam);
        }
        return Result.error("查无结果");
    }


}
