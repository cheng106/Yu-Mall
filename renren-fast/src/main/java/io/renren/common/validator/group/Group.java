/**
 * Copyright (c) 2016-2019 人人開源 All rights reserved.
 * <p>
 * https://www.renren.io
 * <p>
 * 版權所有，侵權必究！
 */

package io.renren.common.validator.group;

import javax.validation.GroupSequence;

/**
 * 定義校驗順序，如果AddGroup群組失敗，則UpdateGroup群組不會再校驗
 *
 * @author Mark sunlightcs@gmail.com
 */
@GroupSequence({AddGroup.class, UpdateGroup.class})
public interface Group {

}
