package com.histone.client.eureka.producer;/**
 * @ProjectName: song-project-server-case
 * @Package: com.histone.client.eureka.producer
 * @ClassName: DemoProducer
 * @Author: dongsong
 * @Description: 生产者产生api接口
 * @Date: 2019/11/13 11:57
 * @Version: 1.0
 */

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *@program: song-project-server-case
 *@description: 生产者产生api接口 eureka-client-producer-8053
 *@author: by song
 *@create: 2019-11-13 11:57
 */
@RestController
public class DemoProducer {
    @RequestMapping(value="/producer")
    public String demoproducer(@RequestParam("message") String message){
        return String.format("eureka-client-producer-8053  producer produce message:%s",message);
    }

    @RequestMapping(value="/hello")
    public String hello(){
        return "-------------zhe shi producer---------hello";
    }

}
