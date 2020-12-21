package com.histone.song.portal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableDiscoveryClient
@EnableFeignClients({"com.histone.song.demo.api"})
@SpringBootApplication
public class SongProjectPortalMainApplication {

    public static void main(String[] args) {
        SpringApplication.run(SongProjectPortalMainApplication.class, args);
    }

}
