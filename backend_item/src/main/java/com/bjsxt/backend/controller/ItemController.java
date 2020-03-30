package com.bjsxt.backend.controller;

import com.bjsxt.backend.service.ItemService;
import com.bjsxt.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wuge
 * @date 2020/3/28 18:01
 */
@RestController
@RequestMapping("/backend/item")
public class ItemController {

    /**
     * 注入ItemService
     */
    @Autowired
    private ItemService itemService;

    /**
     * 分页查询商品
     * @param page
     * @param rows
     * @return
     */
    @GetMapping("/selectTbItemAllByPage")
    public Result selectTbItemAllByPage(@RequestParam(defaultValue = "1") Integer page,
                                        @RequestParam(defaultValue = "2") Integer rows) {
        try {
            return this.itemService.selectTbItemAllByPage(page, rows);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Result.build(500, "error");
    }

}
