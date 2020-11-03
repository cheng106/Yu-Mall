/**
 * Copyright (c) 2016-2019 人人開源 All rights reserved.
 * <p>
 * https://www.renren.io
 * <p>
 * 版權所有，侵權必究！
 */

package io.renren.modules.job.task;

/**
 * 定時任務介面，所有定時任務都要實做該介面
 *
 * @author Mark sunlightcs@gmail.com
 */
public interface ITask {

    /**
     * 執行定時任務介面
     *
     * @param params 參數，多參數使用JSON
     */
    void run(String params);
}