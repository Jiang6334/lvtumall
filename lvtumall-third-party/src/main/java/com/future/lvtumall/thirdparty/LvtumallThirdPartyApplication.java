package com.future.lvtumall.thirdparty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class LvtumallThirdPartyApplication {

    public static void main(String[] args) {
        SpringApplication.run(LvtumallThirdPartyApplication.class, args);
    }

}
