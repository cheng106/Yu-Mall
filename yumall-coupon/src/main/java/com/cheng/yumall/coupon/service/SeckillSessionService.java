package com.cheng.yumall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cheng.common.utils.PageUtils;
import com.cheng.yumall.coupon.entity.SeckillSessionEntity;

import java.util.Map;

/**
 * 秒殺活動場次
 *
 * @author Cheng
 * @email cheng106.andy@gmail.com
 * @date 2020-11-14 01:49:17
 */
public interface SeckillSessionService extends IService<SeckillSessionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

