package com.cheng.yumall.member.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 會員
 * 
 * @author Cheng
 * @email cheng106.andy@gmail.com
 * @date 2020-11-14 02:15:34
 */
@Data
@TableName("ums_member")
public class MemberEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * 會員等級id
	 */
	private Long levelId;
	/**
	 * 會員名稱
	 */
	private String username;
	/**
	 * 密碼
	 */
	private String password;
	/**
	 * 暱稱
	 */
	private String nickname;
	/**
	 * 手機號碼
	 */
	private String mobile;
	/**
	 * 信箱
	 */
	private String email;
	/**
	 * 大頭貼
	 */
	private String header;
	/**
	 * 性別
	 */
	private Integer gender;
	/**
	 * 生日
	 */
	private Date birth;
	/**
	 * 所在城市
	 */
	private String city;
	/**
	 * 職業
	 */
	private String job;
	/**
	 * 個性簽名
	 */
	private String sign;
	/**
	 * 會員來源
	 */
	private Integer sourceType;
	/**
	 * 積分
	 */
	private Integer integration;
	/**
	 * 成長值
	 */
	private Integer growth;
	/**
	 * 啟用狀態
	 */
	private Integer status;
	/**
	 * 註冊時間
	 */
	private Date createTime;

}
