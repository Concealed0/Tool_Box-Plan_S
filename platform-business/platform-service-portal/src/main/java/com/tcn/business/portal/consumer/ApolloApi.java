package com.tcn.business.portal.consumer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ProjectName: song-project-server-case
 * @Package: com.histone.song.consumer.controller
 * @ClassName: ApolloApi
 * @Author: dongsong
 * @Description:
 * @Date: 2019/11/14 16:14
 * @Version: 1.0
 */
@FeignClient(name="eureka-client-apollo-9093")
public interface ApolloApi {
    @RequestMapping(value="apollo")
    public String demoapollo(@RequestParam("message") String message);
}
