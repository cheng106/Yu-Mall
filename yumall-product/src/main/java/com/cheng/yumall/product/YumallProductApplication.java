package com.cheng.yumall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.cheng.yumall.product.dao")
@SpringBootApplication
public class YumallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(YumallProductApplication.class, args);
    }

}