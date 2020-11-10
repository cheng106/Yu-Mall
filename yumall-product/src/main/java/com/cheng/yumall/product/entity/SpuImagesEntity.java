package com.cheng.yumall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * spu圖片
 * 
 * @author Cheng®
 * @email cheng106.andy@gmail.com
 * @date 2020-11-09 23:46:12
 */
@Data
@TableName("pms_spu_images")
public class SpuImagesEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * spu_id
	 */
	private Long spuId;
	/**
	 * 圖片名
	 */
	private String imgName;
	/**
	 * 圖片url
	 */
	private String imgUrl;
	/**
	 * 順序
	 */
	private Integer imgSort;
	/**
	 * 是否預設圖片
	 */
	private Integer defaultImg;

}
