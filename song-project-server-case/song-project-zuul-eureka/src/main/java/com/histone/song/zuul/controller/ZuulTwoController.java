package com.histone.song.zuul.controller;/**
 * @ProjectName: song-project-server-case
 * @Package: com.histone.song.zuul.controller
 * @ClassName: ZuulTwoController
 * @Author: dongsong
 * @Description: 第二个路由测试控制器
 * @Date: 2019/11/21 10:25
 * @Version: 1.0
 */

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *@program: song-project-server-case
 *@description: 第二个路由测试控制器
 *@author: by song
 *@create: 2019-11-21 10:25
 */
@RestController
@RequestMapping("/two")
public class ZuulTwoController {
    @RequestMapping(value="/hello/{name}")
    public String hello(@RequestParam("name") String name){
        return "hello"+name+"this is zuulcontroller----/two/hello";
    }


}
