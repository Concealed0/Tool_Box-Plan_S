package com.tcn.business.api.controller;/**
 * @ProjectName: song-project-server-case
 * @Package: com.histone.song.consumer.controller
 * @ClassName: ZuulConsumerController
 * @Author: dongsong
 * @Description: 网关测试
 * @Date: 2019/11/21 10:51
 * @Version: 1.0
 */

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *@program: song-project-server-case
 *@description: 网关测试
 *@author: by song
 *@create: 2019-11-21 10:51
 */
@RestController
@RequestMapping("/consumer")
public class ZuulConsumerController {
   // http://192.168.253.2:8050/consumer/hello  ------网关跳转
    @RequestMapping(value="/hello")
    public String hello(@RequestParam(value = "name",required = false,defaultValue = "sdfasfasdf") String name){
        return "hello-----"+name+"-----this is zuul-consumer-controller----/consumer/hello";
    }
}
