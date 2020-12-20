package com.histone.song.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.openfeign.EnableFeignClients;



@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients({"com.histone.song.consumer.controller"})
public class SongProjectClientConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(SongProjectClientConsumerApplication.class, args);
    }

}
