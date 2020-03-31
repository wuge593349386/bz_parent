package com.bjsxt.backend.feign;

import com.bjsxt.pojo.*;
import com.bjsxt.utils.PageResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * CommonItem声明式调用服务
 * @author wuge
 * @date 2020/3/30
 */
@FeignClient(value = "common-item")
public interface CommonItemFeignClient {

    /**
     * 商品查询服务
     * @param page
     * @param rows
     * @return
     */
    @GetMapping("/service/item/selectTbItemAllByPage")
    PageResult selectTbItemAllByPage(@RequestParam("page") Integer page, @RequestParam("rows") Integer rows);

    /**
     * 商品类目查询
     * @param id
     * @return
     */
    @PostMapping("/service/itemCategory/selectItemCategoryByParentId")
    List<TbItemCat> selectItemCategoryByParentId(@RequestParam("id") Long id);

    /**
     * 商品参数查询
     * @param itemCatId
     * @return
     */
    @PostMapping("/service/itemParam/selectItemParamByItemCatId")
    TbItemParam selectItemParamByItemCatId(@RequestParam("itemCatId") Long itemCatId);

    /**
     * 插入商品信息
     * @param tbItem
     * @return
     */
    @PostMapping("/service/item/insertTbItem")
    Integer insertTbItem(TbItem tbItem);

    /**
     * 插入商品描述
     * @param tbItemDesc
     * @return
     */
    @PostMapping("/service/itemDesc/insertTbItemDesc")
    Integer insertItemDesc(TbItemDesc tbItemDesc);

    /**
     * 插入商品规格参数
     * @param tbItemParamItem
     * @return
     */
    @PostMapping("/service/itemParamItem/insertTbItemParamItem")
    Integer insertTbItemParamItem(TbItemParamItem tbItemParamItem);
}
