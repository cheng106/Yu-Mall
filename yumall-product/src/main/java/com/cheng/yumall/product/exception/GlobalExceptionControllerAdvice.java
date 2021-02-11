package com.cheng.yumall.product.exception;

import com.cheng.common.exception.ErrorCodeEnum;
import com.cheng.common.utils.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName GlobalExceptionControllerAdvice
 * @Description TODO
 * @Author cheng
 * @Date 2021/2/11 12:18
 * @Version 1.0
 **/
@Slf4j
@RestControllerAdvice(basePackages = "com.cheng.yumall.product.controller")
public class GlobalExceptionControllerAdvice {

    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public R handleValidException(MethodArgumentNotValidException e) {
        log.error("參數驗證出現異常{}，異常類型:{}", e.getMessage(), e.getClass());
        BindingResult result = e.getBindingResult();
        Map<String, String> errMap = new HashMap<>();
        result.getFieldErrors().forEach(err -> errMap.put(err.getField(), err.getDefaultMessage()));
        return R.error(ErrorCodeEnum.VALID_EXCEPTION.getCode(), ErrorCodeEnum.VALID_EXCEPTION.getMsg()).put("data", errMap);
    }

    @ExceptionHandler(value = Throwable.class)
    public R handleException(Throwable throwable) {
        return R.error(ErrorCodeEnum.UNKNOWN_EXCEPTION.getCode(), ErrorCodeEnum.UNKNOWN_EXCEPTION.getMsg());
    }
}
