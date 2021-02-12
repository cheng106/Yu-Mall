package com.cheng.yumall.product.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import com.cheng.common.valid.AddGroup;
import com.cheng.common.valid.UpdateGroup;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import com.cheng.yumall.product.entity.BrandEntity;
import com.cheng.yumall.product.service.BrandService;
import com.cheng.common.utils.PageUtils;
import com.cheng.common.utils.R;

import javax.validation.*;


/**
 * 品牌
 *
 * @author Cheng®
 * @email cheng106.andy@gmail.com
 * @date 2020-11-09 23:46:12
 */
@Slf4j
@RestController
@RequestMapping("product/brand")
public class BrandController {

    @Autowired
    private BrandService brandService;

    ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
    Validator validator = factory.getValidator();

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = brandService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 訊息
     */
    @RequestMapping("/info/{brandId}")
    public R info(@PathVariable("brandId") Long brandId) {
        BrandEntity brand = brandService.getById(brandId);

        return R.ok().put("brand", brand);
    }

    /**
     * 保存
     */
    @PostMapping("/save")
    public R save(@Validated({AddGroup.class}) @RequestBody BrandEntity brand) {
        brandService.save(brand);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@Validated({UpdateGroup.class}) @RequestBody BrandEntity brand) {
        brandService.updateById(brand);
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] brandIds) {
        brandService.removeByIds(Arrays.asList(brandIds));

        return R.ok();
    }

}
