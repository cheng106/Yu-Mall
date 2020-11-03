/**
 * Copyright (c) 2016-2019 人人開源 All rights reserved.
 *
 * https://www.renren.io
 *
 * 版權所有，侵權必究！
 */

package io.renren.modules.job.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 定時任務日誌
 *
 * @author Mark sunlightcs@gmail.com
 */
@Data
@TableName("schedule_job_log")
public class ScheduleJobLogEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	/**
	 * 日誌id
	 */
	@TableId
	private Long logId;
	
	/**
	 * 任務id
	 */
	private Long jobId;
	
	/**
	 * spring bean名稱
	 */
	private String beanName;
	
	/**
	 * 參數
	 */
	private String params;
	
	/**
	 * 任務狀態    0：成功    1：失敗
	 */
	private Integer status;
	
	/**
	 * 失敗訊息
	 */
	private String error;
	
	/**
	 * 耗時(單位：毫秒)
	 */
	private Integer times;
	
	/**
	 * 建立時間
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date createTime;
	
}
