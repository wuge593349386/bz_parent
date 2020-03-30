import com.bjsxt.item.service.ItemCategoryService;
import com.bjsxt.item.service.ItemService;
import com.bjsxt.pojo.TbItemCat;
import com.bjsxt.utils.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 商品类目控制类
 *
 * @author wuge
 * @date 2020/3/27
 */
@RestController
@RequestMapping("/service/itemCategory")
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
    @GetMapping("/selectItemCategoryByParentId")
    public List<TbItemCat> selectItemCategoryByParentId(@RequestParam Long id){
        return this.itemCategoryService.selectItemCategoryByParentId(id);
    }


}
