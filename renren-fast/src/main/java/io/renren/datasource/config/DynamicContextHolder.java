/**
 * Copyright (c) 2018 人人開源 All rights reserved.
 * <p>
 * https://www.renren.io
 * <p>
 * 版權所有，侵權必究！
 */

package io.renren.datasource.config;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 多資料庫環境
 *
 * @author Mark sunlightcs@gmail.com
 */
public class DynamicContextHolder {
    @SuppressWarnings("unchecked")
    private static final ThreadLocal<Deque<String>> CONTEXT_HOLDER = new ThreadLocal() {
        @Override
        protected Object initialValue() {
            return new ArrayDeque();
        }
    };

    /**
     * 取得目前執行序得資料庫
     *
     * @return 資料庫名稱
     */
    public static String peek() {
        return CONTEXT_HOLDER.get().peek();
    }

    /**
     * 設定目前執行序資料庫
     *
     * @param dataSource 資料庫名稱
     */
    public static void push(String dataSource) {
        CONTEXT_HOLDER.get().push(dataSource);
    }

    /**
     * 清空目前執行序資料庫
     */
    public static void poll() {
        Deque<String> deque = CONTEXT_HOLDER.get();
        deque.poll();
        if (deque.isEmpty()) {
            CONTEXT_HOLDER.remove();
        }
    }

}