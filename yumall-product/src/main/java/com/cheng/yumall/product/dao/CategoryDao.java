package com.cheng.yumall.product.dao;

import com.cheng.yumall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三級分類
 * 
 * @author Cheng®
 * @email cheng106.andy@gmail.com
 * @date 2020-11-09 23:46:12
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
