/**
 * Copyright (c) 2016-2019 人人開源 All rights reserved.
 * <p>
 * https://www.renren.io
 * <p>
 * 版權所有，侵權必究！
 */

package io.renren.modules.job.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.renren.common.utils.PageUtils;
import io.renren.modules.job.entity.ScheduleJobEntity;

import java.util.Map;

/**
 * 定時任務
 *
 * @author Mark sunlightcs@gmail.com
 */
public interface ScheduleJobService extends IService<ScheduleJobEntity> {

    PageUtils queryPage(Map<String, Object> params);

    /**
     * 儲存定時任務
     */
    void saveJob(ScheduleJobEntity scheduleJob);

    /**
     * 更新定時任務
     */
    void update(ScheduleJobEntity scheduleJob);

    /**
     * 批次刪除定時任務
     */
    void deleteBatch(Long[] jobIds);

    /**
     * 批次更新定時任務狀態
     */
    int updateBatch(Long[] jobIds, int status);

    /**
     * 立即執行
     */
    void run(Long[] jobIds);

    /**
     * 暫停執行
     */
    void pause(Long[] jobIds);

    /**
     * 恢復執行
     */
    void resume(Long[] jobIds);
}
