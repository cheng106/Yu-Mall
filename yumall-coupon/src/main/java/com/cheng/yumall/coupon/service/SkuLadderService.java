package com.cheng.yumall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cheng.common.utils.PageUtils;
import com.cheng.yumall.coupon.entity.SkuLadderEntity;

import java.util.Map;

/**
 * 商品階梯價格
 *
 * @author Cheng
 * @email cheng106.andy@gmail.com
 * @date 2020-11-14 01:49:17
 */
public interface SkuLadderService extends IService<SkuLadderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

