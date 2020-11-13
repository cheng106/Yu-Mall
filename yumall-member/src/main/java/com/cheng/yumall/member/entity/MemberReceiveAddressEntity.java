package com.cheng.yumall.member.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 會員收貨地址
 * 
 * @author Cheng
 * @email cheng106.andy@gmail.com
 * @date 2020-11-14 02:15:34
 */
@Data
@TableName("ums_member_receive_address")
public class MemberReceiveAddressEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * member_id
	 */
	private Long memberId;
	/**
	 * 收貨人姓名
	 */
	private String name;
	/**
	 * 電話
	 */
	private String phone;
	/**
	 * 郵遞區號
	 */
	private String postCode;
	/**
	 * 直轄市
	 */
	private String province;
	/**
	 * 城市
	 */
	private String city;
	/**
	 * 區
	 */
	private String region;
	/**
	 * 詳細地址(街道)
	 */
	private String detailAddress;
	/**
	 * 市區代碼
	 */
	private String areacode;
	/**
	 * 是否預設
	 */
	private Integer defaultStatus;

}
