package com.bjsxt.item.controller;

import com.bjsxt.item.service.ItemParamService;
import com.bjsxt.pojo.TbItemParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 商品参数控制类
 *
 * @author wuge
 * @date 2020/3/27
 */
@RestController
@RequestMapping("/service/itemParam")
public class ItemParamController {

    /**
     * 注入ItemParamService
     */
    @Autowired
    private ItemParamService itemParamService;

    /**
     * 查询商品参数
     * @param id
     * @return
     */
    @GetMapping("/selectItemCategoryByParentId")
    public TbItemParam selectItemParamByItemCatId(@RequestParam Long itemCatId){
        return this.itemParamService.selectItemParamByItemCatId(itemCatId);
    }

}
