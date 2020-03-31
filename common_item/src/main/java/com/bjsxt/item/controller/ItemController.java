package com.bjsxt.item.controller;

import com.bjsxt.item.service.ItemService;
import com.bjsxt.pojo.TbItem;
import com.bjsxt.utils.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 商品控制类
 *
 * @author wuge
 * @date 2020/3/27
 */
@RestController
@RequestMapping("/service/item")
public class ItemController {

    /**
     * 注入itemService
     */
    @Autowired
    private ItemService itemService;

    /**
     * 查询商品数据
     * @param page
     * @param rows
     * @return
     */
    @GetMapping("/selectTbItemAllByPage")
    public PageResult selectTbItemAllByPage(@RequestParam Integer page, @RequestParam Integer rows) {
        return itemService.selectTbItemAllByPage(page, rows);
    }

    /**
     * 插入商品
     * @param tbItem
     * @return
     */
    @PostMapping("/insertTbItem")
    public Integer insertTbItem(@RequestBody TbItem tbItem){
        return this.itemService.insertTbItem(tbItem);
    }

    /**
     * 删除商品
     * @param tbItem
     * @return
     */
    /*@PostMapping("/deleteItemById")
    public Integer deleteItemById(@RequestBody TbItem tbItem){
        return this.itemService.updateItemById(tbItem);
    }*/
}
