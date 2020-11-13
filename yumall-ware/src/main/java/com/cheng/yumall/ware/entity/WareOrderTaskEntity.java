package com.cheng.yumall.ware.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 庫存工作單
 * 
 * @author Cheng
 * @email cheng106.andy@gmail.com
 * @date 2020-11-14 02:39:09
 */
@Data
@TableName("wms_ware_order_task")
public class WareOrderTaskEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * order_id
	 */
	private Long orderId;
	/**
	 * order_sn
	 */
	private String orderSn;
	/**
	 * 收貨人
	 */
	private String consignee;
	/**
	 * 收貨人電話
	 */
	private String consigneeTel;
	/**
	 * 配送地址
	 */
	private String deliveryAddress;
	/**
	 * 訂單備註
	 */
	private String orderComment;
	/**
	 * 付款方式【 1:線上付款 2:貨到付款】
	 */
	private Integer paymentWay;
	/**
	 * 任務狀態
	 */
	private Integer taskStatus;
	/**
	 * 訂單描述
	 */
	private String orderBody;
	/**
	 * 物流單號
	 */
	private String trackingNo;
	/**
	 * create_time
	 */
	private Date createTime;
	/**
	 * 倉庫id
	 */
	private Long wareId;
	/**
	 * 工作單備註
	 */
	private String taskComment;

}
