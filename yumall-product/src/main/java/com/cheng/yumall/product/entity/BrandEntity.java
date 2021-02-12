package com.cheng.yumall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

import com.cheng.common.valid.AddGroup;
import com.cheng.common.valid.UpdateGroup;
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
    @NotNull(message = "修改必須指定品牌ID", groups = {UpdateGroup.class})
    @Null(message = "新增不能指定ID", groups = {AddGroup.class})
    @TableId
    private Long brandId;
    /**
     * 品牌名稱
     */
    @NotBlank(message = "品牌名稱不能為空白", groups = {AddGroup.class, UpdateGroup.class})
    private String name;
    /**
     * 品牌logo地址
     */
    @NotBlank(groups = {AddGroup.class})
    @URL(message = "Logo必須是合法URL", groups = {AddGroup.class, UpdateGroup.class})
    private String logo;
    /**
     * 介紹
     */
    private String descript;
    /**
     * 顯示狀態[0-不顯示；1-顯示]
     */
    @NotNull
    private Integer showStatus;
    /**
     * 搜尋首字母
     */
    @NotEmpty(groups = {AddGroup.class})
    @Pattern(regexp = "/^[a-z][A-Z]$/", message = "搜尋首字母必須是單個英文字母", groups = {AddGroup.class, UpdateGroup.class})
    private String firstLetter;
    /**
     * 排序
     */
    @NotNull(groups = {AddGroup.class})
    @Min(value = 0, message = "排序數字必須大於等於0", groups = {AddGroup.class, UpdateGroup.class})
    private Integer sort;

}
