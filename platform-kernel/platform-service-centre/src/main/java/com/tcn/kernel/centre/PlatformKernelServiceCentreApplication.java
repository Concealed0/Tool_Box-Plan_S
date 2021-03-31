package com.tcn.kernel.centre;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaServer
@ComponentScan(basePackages = {"com.tcn.business.portal"})
public class PlatformKernelServiceCentreApplication {
    public static void main(String[] args) {
        SpringApplication.run(PlatformKernelServiceCentreApplication.class, args);
    }

}
