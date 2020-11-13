package com.cheng.yumall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.cheng.yumall.product.entity.BrandEntity;
import com.cheng.yumall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@SpringBootTest
class YumallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
        // add
//        BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setDescript("");
//        brandEntity.setName("Test");
//        brandService.save(brandEntity);
//        System.out.println("brandEntity = " + brandEntity);

        // modify
//        brandEntity.setBrandId(1L);
//        brandEntity.setDescript("WOW");
//        brandService.updateById(brandEntity);

        // select
        List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1L));
        list.forEach(item -> System.out.println("item = " + item));

    }

}
