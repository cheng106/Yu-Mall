/**
 * Copyright (c) 2016-2019 人人開源 All rights reserved.
 * <p>
 * https://www.renren.io
 * <p>
 * 版權所有，侵權必究！
 */

package io.renren.modules.oss.cloud;

import io.renren.common.utils.DateUtils;
import org.apache.commons.lang.StringUtils;

import java.io.InputStream;
import java.util.Date;
import java.util.UUID;

/**
 * 雲存儲(支持七牛、阿里雲、騰訊雲、又拍雲)
 *
 * @author Mark sunlightcs@gmail.com
 */
public abstract class CloudStorageService {
    /**
     * 雲存儲設定訊息
     */
    CloudStorageConfig config;

    /**
     * 文件路徑
     *
     * @param prefix 前綴
     * @param suffix 後綴
     * @return 返回上傳路徑
     */
    public String getPath(String prefix, String suffix) {
        // 產生uuid
        String uuid = UUID.randomUUID().toString().replaceAll("-", "");
        // 文件路徑
        String path = DateUtils.format(new Date(), "yyyyMMdd") + "/" + uuid;

        if (StringUtils.isNotBlank(prefix)) {
            path = prefix + "/" + path;
        }

        return path + suffix;
    }

    /**
     * 文件上傳
     *
     * @param data 文件Byte陣列
     * @param path 文件路徑，包含文件名
     * @return 返回http地址
     */
    public abstract String upload(byte[] data, String path);

    /**
     * 文件上傳
     *
     * @param data   文件Byte數組
     * @param suffix 後綴
     * @return 返回http地址
     */
    public abstract String uploadSuffix(byte[] data, String suffix);

    /**
     * 文件上傳
     *
     * @param inputStream 字節流
     * @param path        文件路徑，包含文件名
     * @return 返回http地址
     */
    public abstract String upload(InputStream inputStream, String path);

    /**
     * 文件上傳
     *
     * @param inputStream 字節流
     * @param suffix      後綴
     * @return 返回http地址
     */
    public abstract String uploadSuffix(InputStream inputStream, String suffix);

}
