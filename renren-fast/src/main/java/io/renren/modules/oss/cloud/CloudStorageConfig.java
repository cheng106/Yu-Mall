/**
 * Copyright (c) 2016-2019 人人開源 All rights reserved.
 * <p>
 * https://www.renren.io
 * <p>
 * 版權所有，侵權必究！
 */

package io.renren.modules.oss.cloud;


import io.renren.common.validator.group.AliyunGroup;
import io.renren.common.validator.group.QcloudGroup;
import io.renren.common.validator.group.QiniuGroup;
import lombok.Data;
import org.hibernate.validator.constraints.Range;
import org.hibernate.validator.constraints.URL;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * 雲儲存設定訊息
 *
 * @author Mark sunlightcs@gmail.com
 */
@Data
public class CloudStorageConfig implements Serializable {
    private static final long serialVersionUID = 1L;

    //類型 1：七牛  2：阿里雲  3：騰訊雲
    @Range(min = 1, max = 3, message = "類型錯誤")
    private Integer type;

    //七牛綁定的域名
    @NotBlank(message = "七牛綁定的域名不能為空", groups = QiniuGroup.class)
    @URL(message = "七牛綁定的域名格式不正確", groups = QiniuGroup.class)
    private String qiniuDomain;
    //七牛路徑前綴
    private String qiniuPrefix;
    //七牛ACCESS_KEY
    @NotBlank(message = "七牛AccessKey不能為空", groups = QiniuGroup.class)
    private String qiniuAccessKey;
    //七牛SECRET_KEY
    @NotBlank(message = "七牛SecretKey不能為空", groups = QiniuGroup.class)
    private String qiniuSecretKey;
    //七牛存儲空間名
    @NotBlank(message = "七牛空間名不能為空", groups = QiniuGroup.class)
    private String qiniuBucketName;

    //阿里雲綁定的域名
    @NotBlank(message = "阿里雲綁定的域名不能為空", groups = AliyunGroup.class)
    @URL(message = "阿里雲綁定的域名格式不正確", groups = AliyunGroup.class)
    private String aliyunDomain;
    //阿里雲路徑前綴
    private String aliyunPrefix;
    //阿里雲EndPoint
    @NotBlank(message = "阿里雲EndPoint不能為空", groups = AliyunGroup.class)
    private String aliyunEndPoint;
    //阿里雲AccessKeyId
    @NotBlank(message = "阿里雲AccessKeyId不能為空", groups = AliyunGroup.class)
    private String aliyunAccessKeyId;
    //阿里雲AccessKeySecret
    @NotBlank(message = "阿里雲AccessKeySecret不能為空", groups = AliyunGroup.class)
    private String aliyunAccessKeySecret;
    //阿里雲BucketName
    @NotBlank(message = "阿里雲BucketName不能為空", groups = AliyunGroup.class)
    private String aliyunBucketName;

    //騰訊雲綁定的域名
    @NotBlank(message = "騰訊雲綁定的域名不能為空", groups = QcloudGroup.class)
    @URL(message = "騰訊雲綁定的域名格式不正確", groups = QcloudGroup.class)
    private String qcloudDomain;
    //騰訊雲路徑前綴
    private String qcloudPrefix;
    //騰訊雲AppId
    @NotNull(message = "騰訊雲AppId不能為空", groups = QcloudGroup.class)
    private Integer qcloudAppId;
    //騰訊雲SecretId
    @NotBlank(message = "騰訊雲SecretId不能為空", groups = QcloudGroup.class)
    private String qcloudSecretId;
    //騰訊雲SecretKey
    @NotBlank(message = "騰訊雲SecretKey不能為空", groups = QcloudGroup.class)
    private String qcloudSecretKey;
    //騰訊雲BucketName
    @NotBlank(message = "騰訊雲BucketName不能為空", groups = QcloudGroup.class)
    private String qcloudBucketName;
    //騰訊雲COS所屬地區
    @NotBlank(message = "所屬地區不能為空", groups = QcloudGroup.class)
    private String qcloudRegion;


}
