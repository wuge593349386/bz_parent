package com.bjsxt.backend.controller;

import com.bjsxt.backend.service.ItemCategoryService;
import com.bjsxt.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 商品类目控制类
 *
 * @author wuge
 * @date 2020/3/27
 */
@RestController
@RequestMapping("/backend/itemCategory")
public class ItemCategoryController {

    /**
     * 注入ItemCategoryService
     */
    @Autowired
    private ItemCategoryService itemCategoryService;

    /**
     * 查询商品类目
     * @param id
     * @return
     */
    @GetMapping("selectItemCategoryByParentId")
    public Result selectItemCategoryByParentId(@RequestParam(value = "id", defaultValue = "0") Long id){
        try{
            return this.itemCategoryService.selectItemCategoryByParentId(id);
        }catch (Exception e){
            e.printStackTrace();
        }
        return Result.build(500, "error");
    }

}
