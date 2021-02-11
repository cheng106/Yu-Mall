package com.cheng.yumall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

import lombok.Data;
import org.hibernate.validator.constraints.URL;

import javax.validation.constraints.*;

/**
 * 品牌
 *
 * @author Cheng®
 * @email cheng106.andy@gmail.com
 * @date 2020-11-09 23:46:12
 */
@Data
@TableName("pms_brand")
public class BrandEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 品牌id
     */
    @TableId
    private Long brandId;
    /**
     * 品牌名稱
     */
    @NotBlank(message = "品牌名稱不能為空白")
    private String name;
    /**
     * 品牌logo地址
     */
    @NotNull
    @URL(message = "Logo必須是合法URL")
    private String logo;
    /**
     * 介紹
     */
    @NotNull
    @NotBlank(message = "介紹不能為空白")
    private String descript;
    /**
     * 顯示狀態[0-不顯示；1-顯示]
     */
    @NotNull
    private Integer showStatus;
    /**
     * 搜尋首字母
     */
    @NotNull
    @Pattern(regexp = "/^[a-z][A-Z]$/", message = "搜尋首字母必須是單個英文字母")
    private String firstLetter;
    /**
     * 排序
     */
    @NotNull
    @Min(value = 0, message = "排序數字必須大於等於0")
    private Integer sort;

}
