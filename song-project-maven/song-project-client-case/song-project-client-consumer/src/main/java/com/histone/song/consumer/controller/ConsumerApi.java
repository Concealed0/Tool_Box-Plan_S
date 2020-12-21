package com.histone.song.consumer.controller;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ProjectName: song-project-server-case
 * @Package: com.histone.song.consumer.controller
 * @ClassName: ConsumerApi
 * @Author: dongsong
 * @Description: api接口
 * @Date: 2019/11/13 13:34
 * @Version: 1.0
 */

@FeignClient(name="eureka-client-producer-8053")
public interface ConsumerApi {
    @RequestMapping(value="/producer")
    public String demo(@RequestParam("message") String message);
}
