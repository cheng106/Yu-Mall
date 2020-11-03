/**
 * Copyright (c) 2016-2019 人人開源 All rights reserved.
 * <p>
 * https://www.renren.io
 * <p>
 * 版權所有，侵權必究！
 */

package io.renren.modules.sys.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;


/**
 * 系統日誌
 *
 * @author Mark sunlightcs@gmail.com
 */
@Data
@TableName("sys_log")
public class SysLogEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @TableId
    private Long id;
    //使用者名稱
    private String username;
    //使用者操作
    private String operation;
    //請求方法
    private String method;
    //請求參數
    private String params;
    //執行時間(毫秒)
    private Long time;
    //IP位置
    private String ip;
    //建立時間
    private Date createDate;

}
