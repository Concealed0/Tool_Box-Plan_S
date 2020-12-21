package com.histone.song.demo.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ProjectName: song-project-server-case
 * @Package: com.histone.song.demo.api
 * @ClassName: DemoFeign
 * @Author: dongsong
 * @Description: 使用Eureka注册服务
 * @Date: 2019/11/13 11:05
 * @Version: 1.0
 */


@FeignClient(name="eureka-client-producer-8053")
public interface DemoFeign {
    @RequestMapping(value="/producer")
    public String demo(@RequestParam(value="message") String message);
}
