package com.cheng.yumall.member.dao;

import com.cheng.yumall.member.entity.MemberLevelEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 會員等級
 * 
 * @author Cheng
 * @email cheng106.andy@gmail.com
 * @date 2020-11-14 02:15:34
 */
@Mapper
public interface MemberLevelDao extends BaseMapper<MemberLevelEntity> {
	
}