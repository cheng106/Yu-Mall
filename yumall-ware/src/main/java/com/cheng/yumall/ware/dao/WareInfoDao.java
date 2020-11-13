package com.cheng.yumall.ware.dao;

import com.cheng.yumall.ware.entity.WareInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 倉庫訊息
 * 
 * @author Cheng
 * @email cheng106.andy@gmail.com
 * @date 2020-11-14 02:39:09
 */
@Mapper
public interface WareInfoDao extends BaseMapper<WareInfoEntity> {
	
}
