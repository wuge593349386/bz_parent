package com.bjsxt.backend.service.impl;

import com.bjsxt.backend.feign.CommonItemFeignClient;
import com.bjsxt.backend.service.ItemService;
import com.bjsxt.utils.PageResult;
import com.bjsxt.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;

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
}
