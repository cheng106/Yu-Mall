package com.cheng.yumall.ware.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 採購訊息
 * 
 * @author Cheng
 * @email cheng106.andy@gmail.com
 * @date 2020-11-14 02:39:09
 */
@Data
@TableName("wms_purchase")
public class PurchaseEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 採購單id
	 */
	@TableId
	private Long id;
	/**
	 * 採購人id
	 */
	private Long assigneeId;
	/**
	 * 採購人
	 */
	private String assigneeName;
	/**
	 * 連絡電話
	 */
	private String phone;
	/**
	 * 優先級
	 */
	private Integer priority;
	/**
	 * 狀態
	 */
	private Integer status;
	/**
	 * 倉庫id
	 */
	private Long wareId;
	/**
	 * 總金額
	 */
	private BigDecimal amount;
	/**
	 * 建立日期
	 */
	private Date createTime;
	/**
	 * 更新日期
	 */
	private Date updateTime;

}
