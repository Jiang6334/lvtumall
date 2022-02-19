package com.future.lvtumall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * 1、spring-session依赖
 * 2、spring-session配置
 * 3、LoginInterceptor拦截器
 */

@EnableRedisHttpSession
@EnableFeignClients(basePackages = "com.future.lvtumall.member.feign")
@EnableDiscoveryClient
@SpringBootApplication
public class LvtumallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(LvtumallMemberApplication.class, args);
    }

}
