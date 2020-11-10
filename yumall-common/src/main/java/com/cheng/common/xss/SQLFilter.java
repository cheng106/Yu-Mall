/**
 * Copyright (c) 2016-2019 人人開源 All rights reserved.
 *
 * https://www.renren.io
 *
 * 版權所有，侵權必究！
 */

package io.renren.common.xss;

import io.renren.common.exception.RRException;
import org.apache.commons.lang.StringUtils;

/**
 * SQL過濾
 *
 * @author Mark sunlightcs@gmail.com
 */
public class SQLFilter {

    /**
     * SQL注入過濾
     * @param str  待驗證的字串
     */
    public static String sqlInject(String str){
        if(StringUtils.isBlank(str)){
            return null;
        }
        // 去掉'|"|;|\字串
        str = StringUtils.replace(str, "'", "");
        str = StringUtils.replace(str, "\"", "");
        str = StringUtils.replace(str, ";", "");
        str = StringUtils.replace(str, "\\", "");

        // 轉換成小寫
        str = str.toLowerCase();

        // 非法字串
        String[] keywords = {"master", "truncate", "insert", "select", "delete", "update", "declare", "alter", "drop"};

        // 判斷是否包含非法字串
        for(String keyword : keywords){
            if(str.contains(keyword)){
                throw new RRException("包含非法字串");
            }
        }

        return str;
    }
}
