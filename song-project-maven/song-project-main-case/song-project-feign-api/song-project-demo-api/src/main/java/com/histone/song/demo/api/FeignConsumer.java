package com.histone.song.demo.api;/**
 * @ProjectName: song-project-server-case
 * @Package: com.histone.song.consumer.controller
 * @ClassName: FeignConsumer
 * @Author: dongsong
 * @Description: 消费者调用生产者API接口
 * @Date: 2019/11/13 13:33
 * @Version: 1.0
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *@program: song-project-server-case
 *@description: 消费者调用生产者API接口
 *@author: by song
 *@create: 2019-11-13 13:33
 */

@RestController
public class FeignConsumer {
    @Autowired
    private ConsumerApi consumerApi;

    @Autowired
    private ApolloApi apolloApi;
    //http://192.168.253.2:8052/consumerB?message=sdfa
    @RequestMapping(value="/consumerB")
    public String demo(@RequestParam("message") String message){
        return consumerApi.demo(message);
    }
    @RequestMapping(value="/apolloB")
    public String apollo(@RequestParam("message") String message){
        return apolloApi.demoapollo(message);
    }
}
