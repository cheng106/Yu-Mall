package com.cheng.yumall.coupon.dao;

import com.cheng.yumall.coupon.entity.SkuLadderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品階梯價格
 * 
 * @author Cheng
 * @email cheng106.andy@gmail.com
 * @date 2020-11-14 01:49:17
 */
@Mapper
public interface SkuLadderDao extends BaseMapper<SkuLadderEntity> {
	
}
