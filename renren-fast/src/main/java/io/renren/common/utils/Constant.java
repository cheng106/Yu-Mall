/**
 * Copyright (c) 2016-2019 人人開源 All rights reserved.
 *
 * https://www.renren.io
 *
 * 版權所有，侵權必究！
 */

package io.renren.common.utils;

/**
 * 常數
 *
 * @author Mark sunlightcs@gmail.com
 */
public class Constant {
	/** 最高權限管理者ID */
	public static final int SUPER_ADMIN = 1;
    /**
     * 目前頁數
     */
    public static final String PAGE = "page";
    /**
     * 每一頁的顯示記錄數量
     */
    public static final String LIMIT = "limit";
    /**
     * 排序欄位
     */
    public static final String ORDER_FIELD = "sidx";
    /**
     * 排序方式
     */
    public static final String ORDER = "order";
    /**
     *  升序
     */
    public static final String ASC = "asc";
	/**
	 * 選單類型
	 * 
	 * @author chenshun
	 * @email sunlightcs@gmail.com
	 * @date 2016年11月15日 下午1:24:29
	 */
    public enum MenuType {
        /**
         * 目錄
         */
    	CATALOG(0),
        /**
         * 選單
         */
        MENU(1),
        /**
         * 按鈕
         */
        BUTTON(2);

        private int value;

        MenuType(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }
    
    /**
     * 定時任務狀態
     * 
     * @author chenshun
     * @email sunlightcs@gmail.com
     * @date 2016年12月3日 上午12:07:22
     */
    public enum ScheduleStatus {
        /**
         * 正常
         */
    	NORMAL(0),
        /**
         * 暫停
         */
    	PAUSE(1);

        private int value;

        ScheduleStatus(int value) {
            this.value = value;
        }
        
        public int getValue() {
            return value;
        }
    }

    /**
     * 雲服務商
     */
    public enum CloudService {
        /**
         * 七牛雲
         */
        QINIU(1),
        /**
         * 阿里雲
         */
        ALIYUN(2),
        /**
         * 騰訊雲
         */
        QCLOUD(3);

        private int value;

        CloudService(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

}
