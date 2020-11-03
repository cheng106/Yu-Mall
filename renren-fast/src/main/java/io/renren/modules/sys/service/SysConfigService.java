/**
 * Copyright (c) 2016-2019 人人開源 All rights reserved.
 * <p>
 * https://www.renren.io
 * <p>
 * 版權所有，侵權必究！
 */

package io.renren.modules.sys.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.renren.common.utils.PageUtils;
import io.renren.modules.sys.entity.SysConfigEntity;

import java.util.Map;

/**
 * 系統設定訊息
 *
 * @author Mark sunlightcs@gmail.com
 */
public interface SysConfigService extends IService<SysConfigEntity> {

    PageUtils queryPage(Map<String, Object> params);

    /**
     * 儲存設定訊息
     */
    public void saveConfig(SysConfigEntity config);

    /**
     * 更新設定訊息
     */
    public void update(SysConfigEntity config);

    /**
     * 根據key，更新value
     */
    public void updateValueByKey(String key, String value);

    /**
     * 刪除設定訊息
     */
    public void deleteBatch(Long[] ids);

    /**
     * 根據key，取得設定的value值
     *
     * @param key           key
     */
    public String getValue(String key);

    /**
     * 根據key，取得value的Object
     * @param key    key
     * @param clazz  Object
     */
    public <T> T getConfigObject(String key, Class<T> clazz);

}
