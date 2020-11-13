package com.cheng.yumall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cheng.common.utils.PageUtils;
import com.cheng.yumall.order.entity.PaymentInfoEntity;

import java.util.Map;

/**
 * 支付訊息表
 *
 * @author Cheng
 * @email cheng106.andy@gmail.com
 * @date 2020-11-14 02:36:14
 */
public interface PaymentInfoService extends IService<PaymentInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

