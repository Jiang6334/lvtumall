package com.future.lvtumall.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class LvtumallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(LvtumallCouponApplication.class, args);
    }

}
