package com.cheng.yumall.member.dao;

import com.cheng.yumall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 會員
 * 
 * @author Cheng
 * @email cheng106.andy@gmail.com
 * @date 2020-11-14 02:15:34
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
