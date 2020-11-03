/**
 * Copyright (c) 2016-2019 人人開源 All rights reserved.
 *
 * https://www.renren.io
 *
 * 版權所有，侵權必究！
 */

package io.renren.modules.sys.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 角色
 *
 * @author Mark sunlightcs@gmail.com
 */
@Data
@TableName("sys_role")
public class SysRoleEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	/**
	 * 角色ID
	 */
	@TableId
	private Long roleId;

	/**
	 * 角色名稱
	 */
	@NotBlank(message="角色名稱不能為空")
	private String roleName;

	/**
	 * 备注
	 */
	private String remark;
	
	/**
	 * 建立者ID
	 */
	private Long createUserId;

	@TableField(exist=false)
	private List<Long> menuIdList;
	
	/**
	 * 建立时间
	 */
	private Date createTime;

	
}
