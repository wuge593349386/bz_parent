package com.bjsxt.item.controller;

import com.bjsxt.item.service.ItemParamItemService;
import com.bjsxt.pojo.TbItemParamItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 商品规格参数控制类
 *
 * @author wuge
 * @date 2020/3/27
 */
@RestController
@RequestMapping("/service/itemParamItem")
public class ItemParamItemController {

    /**
     * 注入ItemParamItemService
     */
    @Autowired
    private ItemParamItemService itemParamItemService;

    /**
     * 插入商品规格参数
     * @param tbItemParamItem
     * @return
     */
    @PostMapping("/insertTbItemParamItem")
    public Integer insertTbItemParamItem(@RequestBody TbItemParamItem tbItemParamItem){
        return this.itemParamItemService.insertTbItemParamItem(tbItemParamItem);
    }

}
