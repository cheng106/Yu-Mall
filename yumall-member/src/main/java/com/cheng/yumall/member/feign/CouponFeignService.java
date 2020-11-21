package com.cheng.yumall.member.feign;

import com.cheng.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName CouponFeignService
 * @Description 遠端調用方法
 * @Author cheng
 * @Date 2020/11/21 09:54
 * @Version 1.0
 **/
@FeignClient("yumall-coupon")
public interface CouponFeignService {

    @RequestMapping("/coupon/coupon/member/list")
    R memberCoupons();
}
