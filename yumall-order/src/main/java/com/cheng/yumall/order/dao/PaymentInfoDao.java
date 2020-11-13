package com.cheng.yumall.order.dao;

import com.cheng.yumall.order.entity.PaymentInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 支付訊息表
 * 
 * @author Cheng
 * @email cheng106.andy@gmail.com
 * @date 2020-11-14 02:36:14
 */
@Mapper
public interface PaymentInfoDao extends BaseMapper<PaymentInfoEntity> {
	
}