package com.cheng.yumall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackages = "com.cheng.yumall.member.feign")
@EnableDiscoveryClient
@SpringBootApplication
public class YumallMemberApplication {

	public static void main(String[] args) {
		SpringApplication.run(YumallMemberApplication.class, args);
	}

}
