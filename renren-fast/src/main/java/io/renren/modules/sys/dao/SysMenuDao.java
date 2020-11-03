/**
 * Copyright (c) 2016-2019 人人開源 All rights reserved.
 *
 * https://www.renren.io
 *
 * 版權所有，侵權必究！
 */

package io.renren.modules.sys.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.renren.modules.sys.entity.SysMenuEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 選單管理
 *
 * @author Mark sunlightcs@gmail.com
 */
@Mapper
public interface SysMenuDao extends BaseMapper<SysMenuEntity> {
	
	/**
	 * 根據父選單，查詢子選單
	 * @param parentId 父選單ID
	 */
	List<SysMenuEntity> queryListParentId(Long parentId);
	
	/**
	 * 取得不包含按鈕的選單列表
	 */
	List<SysMenuEntity> queryNotButtonList();

}
