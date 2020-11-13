package com.cheng.yumall.order.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 支付訊息表
 * 
 * @author Cheng
 * @email cheng106.andy@gmail.com
 * @date 2020-11-14 02:36:14
 */
@Data
@TableName("oms_payment_info")
public class PaymentInfoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * 訂單號（對外業務號）
	 */
	private String orderSn;
	/**
	 * 訂單id
	 */
	private Long orderId;
	/**
	 * 支付寶交易流水號
	 */
	private String alipayTradeNo;
	/**
	 * 支付總金額
	 */
	private BigDecimal totalAmount;
	/**
	 * 交易內容
	 */
	private String subject;
	/**
	 * 支付狀態
	 */
	private String paymentStatus;
	/**
	 * 建立時間
	 */
	private Date createTime;
	/**
	 * 確認時間
	 */
	private Date confirmTime;
	/**
	 * callback內容
	 */
	private String callbackContent;
	/**
	 * callback時間
	 */
	private Date callbackTime;

}
