package com.bjsxt.backend.controller;

import com.bjsxt.backend.service.ItemCategoryService;
import com.bjsxt.backend.service.ItemParamService;
import com.bjsxt.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 商品参数控制类
 *
 * @author wuge
 * @date 2020/3/27
 */
@RestController
@RequestMapping("/backend/itemParam")
public class ItemParamController {

    /**
     * 注入ItemParamService
     */
    @Autowired
    private ItemParamService itemParamService;

    /**
     * 根据商品分类ID查询规格参数模板
     * @param itemCatId
     * @return
     */
    @GetMapping("/selectItemParamByItemCatId/{itemCatId}")
    public Result selectItemParamByItemCatId(@PathVariable("itemCatId") Long itemCatId){
        try{
            return this.itemParamService.selectItemParamByItemCatId(itemCatId);
        }catch (Exception e){
            e.printStackTrace();
        }
        return Result.build(500,"error");
    }

}
