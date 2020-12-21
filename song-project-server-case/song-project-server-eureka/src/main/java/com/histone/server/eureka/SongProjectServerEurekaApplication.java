package com.histone.server.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@EnableEurekaServer
@ComponentScan (basePackages = {"com.histone.client.eureka"})
public class SongProjectServerEurekaApplication {


    public static void main(String[] args) {
        SpringApplication.run(SongProjectServerEurekaApplication.class, args);
    }

}
