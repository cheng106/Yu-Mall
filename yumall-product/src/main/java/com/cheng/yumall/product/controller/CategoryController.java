package com.cheng.yumall.product.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.cheng.yumall.product.entity.CategoryEntity;
import com.cheng.yumall.product.service.CategoryService;
import com.cheng.common.utils.R;

/**
 * 商品三級分類
 *
 * @author Cheng®
 * @email cheng106.andy@gmail.com
 * @date 2020-11-09 23:46:12
 */
@RestController
@RequestMapping("product/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    /**
     * 列表(查詢所有分類和子分類，Tree結構回傳)
     */
    @RequestMapping("/list/tree")
    public R list() {
        List<CategoryEntity> entities = categoryService.listWithTree();
        return R.ok().put("data", entities);
    }


    /**
     * 訊息
     */
    @RequestMapping("/info/{catId}")
    public R info(@PathVariable("catId") Long catId) {
        CategoryEntity category = categoryService.getById(catId);

        return R.ok().put("dataInfo", category);
    }

    /**
     * 保存
     */
    @PostMapping("/save")
    public R save(@RequestBody CategoryEntity category) {
        categoryService.save(category);
        return R.ok();
    }

    @PostMapping("/update/sort")
    public R updateSort(@RequestBody CategoryEntity[] category) {
        categoryService.updateBatchById(Arrays.asList(category));
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody CategoryEntity category) {
        categoryService.updateById(category);

        return R.ok();
    }

    /**
     * 删除
     * ＠RequestBody: 請求時依照參數的類型放入需要的值
     * 例如:參數是一個陣列，所以打API時需要在Body寫[100,101,102])
     * SpringMVC自動將Body轉換成對應的物件
     */
    @PostMapping("/delete")
    public R delete(@RequestBody Long[] catIds) {

        categoryService.removeByIds(Arrays.asList(catIds));

        categoryService.removeMenuByIds(Arrays.asList(catIds));
        return R.ok();
    }

}
