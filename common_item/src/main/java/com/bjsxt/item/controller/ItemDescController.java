package com.bjsxt.item.controller;

import com.bjsxt.item.service.ItemDescService;
import com.bjsxt.pojo.TbItemDesc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 商品详情控制类
 *
 * @author wuge
 * @date 2020/3/27
 */
@RestController
@RequestMapping("/service/itemDesc")
public class ItemDescController {

    /**
     * 注入ItemDescService
     */
    @Autowired
    private ItemDescService insertTbItemDesc;

    /**
     * 插入商品描述
     * @param tbItemDesc
     * @return
     */
    @PostMapping("/insertTbItemDesc")
    public Integer insertTbItem(@RequestBody TbItemDesc tbItemDesc){
        return this.insertTbItemDesc.insertTbItemDesc(tbItemDesc);
    }

}
