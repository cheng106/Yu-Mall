package com.cheng.common.exception;

/**
 * @ClassName ErrorCodeEnum
 * @Description TODO
 * @Author cheng
 * @Date 2021/2/11 14:04
 * @Version 1.0
 **/
public enum ErrorCodeEnum {

    UNKNOWN_EXCEPTION(10000, "系統未知異常"),
    VALID_EXCEPTION(10001, "參數格式驗證失敗");

    private final Integer code;
    private final String msg;

    ErrorCodeEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
