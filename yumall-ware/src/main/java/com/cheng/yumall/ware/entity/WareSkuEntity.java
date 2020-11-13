package com.cheng.yumall.ware.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 商品庫存
 * 
 * @author Cheng
 * @email cheng106.andy@gmail.com
 * @date 2020-11-14 02:39:09
 */
@Data
@TableName("wms_ware_sku")
public class WareSkuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * sku_id
	 */
	private Long skuId;
	/**
	 * 倉庫id
	 */
	private Long wareId;
	/**
	 * 庫存數
	 */
	private Integer stock;
	/**
	 * sku_name
	 */
	private String skuName;
	/**
	 * 鎖定庫存
	 */
	private Integer stockLocked;

}
