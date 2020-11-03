/**
 * Copyright (c) 2016-2019 人人開源 All rights reserved.
 *
 * https://www.renren.io
 *
 * 版權所有，侵權必究！
 */

package io.renren.modules.app.form;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * 註冊表單
 *
 * @author Mark sunlightcs@gmail.com
 */
@Data
@ApiModel(value = "註冊表單")
public class RegisterForm {
    @ApiModelProperty(value = "手機")
    @NotBlank(message="請輸入手機號碼")
    private String mobile;

    @ApiModelProperty(value = "密碼")
    @NotBlank(message="請輸入密碼")
    private String password;

}
