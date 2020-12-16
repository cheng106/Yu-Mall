package com.cheng.yumall.product.service.impl;

import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cheng.common.utils.PageUtils;
import com.cheng.common.utils.Query;

import com.cheng.yumall.product.dao.CategoryDao;
import com.cheng.yumall.product.entity.CategoryEntity;
import com.cheng.yumall.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listWithTree() {
        // 查出所有分類
        // MyBatis的baseMapper等於是categoryDao (參數傳入null等於查詢全部)
        List<CategoryEntity> categoryEntityList = baseMapper.selectList(null);
        // 組成父子的樹狀結構

//        List<CategoryEntity> levelOneMenus = categoryEntityList.stream().filter(entity -> entity.getParentCid() == 0)
//                .map(menu -> {
//                    menu.setChildren(getChildren(menu, categoryEntityList));
//                    return menu;
//                }).sorted((menu1, menu2) -> {
//                    return menu1.getSort() - menu2.getSort();
//                }).collect(Collectors.toList());

        // 找出全部的一級分類，一級分類的父分類為0
        return categoryEntityList.stream().filter(entity -> entity.getParentCid() == 0)
                .peek(menu -> menu.setChildren(getChildren(menu, categoryEntityList)))
                .sorted(Comparator.comparingInt(menu -> (menu.getSort() == null ? 0 : menu.getSort())))
                .collect(Collectors.toList());
    }

    @Override
    public void removeMenuByIds(List<Long> asList) {
        // 檢查目前刪除的選項，是否有父分類

        // 邏輯刪除:使用標記的方式來表示刪除狀態
        // 實際刪除:從資料庫中Delete一筆資料
        baseMapper.deleteBatchIds(asList);
    }

    private List<CategoryEntity> getChildren(CategoryEntity root, List<CategoryEntity> all) {
//        all.stream().filter(categoryEntity -> {
//            return categoryEntity.getParentCid().equals(root.getCatId());
//        }).map(categoryEntity -> {
        // 找到子選單
//            categoryEntity.setChildren(getChildren(categoryEntity, all));
//            return categoryEntity;
//        }).sorted((menu1, menu2) -> {
        // 選單的排序
//            return menu1.getSort() - menu2.getSort();
//        }).collect(Collectors.toList());

        return all.stream().filter(categoryEntity -> categoryEntity.getParentCid().equals(root.getCatId()))
                .peek(categoryEntity -> categoryEntity.setChildren(getChildren(categoryEntity, all)))
                .sorted(Comparator.comparingInt(menu -> (menu.getSort() == null ? 0 : menu.getSort())))
                .collect(Collectors.toList());
    }

}