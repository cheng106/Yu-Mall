package com.cheng.yumall.coupon.dao;

import com.cheng.yumall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 優惠券訊息
 * 
 * @author Cheng
 * @email cheng106.andy@gmail.com
 * @date 2020-11-14 01:49:17
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
