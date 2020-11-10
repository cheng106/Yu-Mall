package com.cheng.yumall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 商品屬性
 * 
 * @author Cheng®
 * @email cheng106.andy@gmail.com
 * @date 2020-11-09 23:46:12
 */
@Data
@TableName("pms_attr")
public class AttrEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 屬性id
	 */
	@TableId
	private Long attrId;
	/**
	 * 屬性名稱
	 */
	private String attrName;
	/**
	 * 是否需要檢索[0-不需要，1-需要]
	 */
	private Integer searchType;
	/**
	 * 屬性圖標
	 */
	private String icon;
	/**
	 * 可選值列表[用逗號分隔]
	 */
	private String valueSelect;
	/**
	 * 屬性類型[0-銷售屬性，1-基本屬性，2-銷售+基本屬性]
	 */
	private Integer attrType;
	/**
	 * 啟用狀態[0-禁用，1-啟用]
	 */
	private Long enable;
	/**
	 * 所屬分類
	 */
	private Long catelogId;
	/**
	 * 快速展示【是否展示在介紹上；0-否 1-是】，在sku中仍然可以調整
	 */
	private Integer showDesc;

}