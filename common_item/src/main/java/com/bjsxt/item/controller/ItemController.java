package com.bjsxt.item.controller;

import com.bjsxt.item.service.ItemService;
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


}
