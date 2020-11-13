package com.cheng.yumall.ware.dao;

import com.cheng.yumall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品庫存
 * 
 * @author Cheng
 * @email cheng106.andy@gmail.com
 * @date 2020-11-14 02:39:09
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
