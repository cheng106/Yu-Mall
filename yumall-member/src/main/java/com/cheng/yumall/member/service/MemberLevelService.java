package com.cheng.yumall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cheng.common.utils.PageUtils;
import com.cheng.yumall.member.entity.MemberLevelEntity;

import java.util.Map;

/**
 * 會員等級
 *
 * @author Cheng
 * @email cheng106.andy@gmail.com
 * @date 2020-11-14 02:15:34
 */
public interface MemberLevelService extends IService<MemberLevelEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

