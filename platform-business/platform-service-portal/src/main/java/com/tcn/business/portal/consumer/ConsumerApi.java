package com.tcn.business.portal.consumer;

import org.springframework.cloud.openfeign.FeignClient;
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
