package com.cheng.yumall.coupon.dao;

import com.cheng.yumall.coupon.entity.HomeSubjectEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 首頁專題表【jd首頁下面很多專題，每個專題連接新的頁面，展示專題商品訊息】
 * 
 * @author Cheng
 * @email cheng106.andy@gmail.com
 * @date 2020-11-14 01:49:17
 */
@Mapper
public interface HomeSubjectDao extends BaseMapper<HomeSubjectEntity> {
	
}
