package com.cheng.yumall.ware.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 倉庫訊息
 * 
 * @author Cheng
 * @email cheng106.andy@gmail.com
 * @date 2020-11-14 02:39:09
 */
@Data
@TableName("wms_ware_info")
public class WareInfoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * 倉庫名稱
	 */
	private String name;
	/**
	 * 倉庫地址
	 */
	private String address;
	/**
	 * 區域號碼
	 */
	private String areacode;

}
