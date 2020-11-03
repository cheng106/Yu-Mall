/**
 * Copyright (c) 2016-2019 人人開源 All rights reserved.
 *
 * https://www.renren.io
 *
 * 版權所有，侵權必究！
 */

package io.renren.modules.sys.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.renren.modules.sys.entity.SysUserRoleEntity;

import java.util.List;



/**
 * 使用者與角色對應關係
 *
 * @author Mark sunlightcs@gmail.com
 */
public interface SysUserRoleService extends IService<SysUserRoleEntity> {
	
	void saveOrUpdate(Long userId, List<Long> roleIdList);
	
	/**
	 * 根據使用者ID，取得角色ID列表
	 */
	List<Long> queryRoleIdList(Long userId);

	/**
	 * 根據角色ID陣列，批次刪除
	 */
	int deleteBatch(Long[] roleIds);
}
