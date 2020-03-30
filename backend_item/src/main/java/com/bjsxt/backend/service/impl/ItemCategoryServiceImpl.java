package com.bjsxt.backend.service.impl;

import com.bjsxt.backend.feign.CommonItemFeignClient;
import com.bjsxt.backend.service.ItemCategoryService;
import com.bjsxt.backend.service.ItemService;
import com.bjsxt.pojo.TbItemCat;
import com.bjsxt.utils.PageResult;
import com.bjsxt.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 服务实现类
 * @author wuge
 * @date 2020/3/30
 */
public class ItemCategoryServiceImpl implements ItemCategoryService {

    /**
     * 注入CommonItemFeignClient
     */
    @Autowired
    private CommonItemFeignClient commonItemFeignClient;

    @Override
    public Result selectItemCategoryByParentId(Long id) {
        List<TbItemCat> list =
                this.commonItemFeignClient.selectItemCategoryByParentId(id);
        if(list != null && list.size() > 0){
            return Result.ok(list);
        }
        return Result.error("查无结果");
    }

}
