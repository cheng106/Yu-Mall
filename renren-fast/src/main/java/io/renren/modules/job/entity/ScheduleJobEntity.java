/**
 * Copyright (c) 2016-2019 人人開源 All rights reserved.
 * <p>
 * https://www.renren.io
 * <p>
 * 版權所有，侵權必究！
 */

package io.renren.modules.job.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.Date;

/**
 * 定時任務
 *
 * @author Mark sunlightcs@gmail.com
 */
@Data
@TableName("schedule_job")
public class ScheduleJobEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 任務調度參數Key
     */
    public static final String JOB_PARAM_KEY = "JOB_PARAM_KEY";

    /**
     * 任務id
     */
    @TableId
    private Long jobId;

    /**
     * spring bean名稱
     */
    @NotBlank(message = "請輸入bean名稱")
    private String beanName;

    /**
     * 參數
     */
    private String params;

    /**
     * cron表達式
     */
    @NotBlank(message = "請輸入cron表達式")
    private String cronExpression;

    /**
     * 任務狀態
     */
    private Integer status;

    /**
     * 備註
     */
    private String remark;

    /**
     * 建立時間
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;

}
