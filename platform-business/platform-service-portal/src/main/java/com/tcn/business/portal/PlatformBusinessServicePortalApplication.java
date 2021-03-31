package com.tcn.business.portal;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient
@EnableFeignClients({"com.tcn.business.api","com.tcn.business.portal.consumer"})
@SpringBootApplication
public class PlatformBusinessServicePortalApplication {
    public static void main(String[] args) {
        SpringApplication.run(PlatformBusinessServicePortalApplication.class, args);
    }

}
