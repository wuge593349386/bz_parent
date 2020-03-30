package com.bjsxt.item.controller;

import com.bjsxt.item.service.ItemCategoryService;
import com.bjsxt.pojo.TbItemCat;
import com.bjsxt.pojo.TbItemParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
