/**
 * Copyright (c) 2016-2019 人人開源 All rights reserved.
 *
 * https://www.renren.io
 *
 * 版權所有，侵權必究！
 */

package io.renren.modules.app.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;


/**
 * 使用者
 *
 * @author Mark sunlightcs@gmail.com
 */
@Data
@TableName("tb_user")
public class UserEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 使用者ID
	 */
	@TableId
	private Long userId;
	/**
	 * 使用者名稱
	 */
	private String username;
	/**
	 * 手機
	 */
	private String mobile;
	/**
	 * 密碼
	 */
	private String password;
	/**
	 * 建立時間
	 */
	private Date createTime;

}
