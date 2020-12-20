package com.histone.song.zuul.controller;
/**
 * @ProjectName: song-project-server-case
 * @Package: com.histone.song.zuul.controller
 * @ClassName: ZuulController
 * @Author: dongsong
 * @Description: 路由判断
 * @Date: 2019/11/21 10:21
 * @Version: 1.0
 */

import org.springframework.web.bind.annotation.*;

/**
 *@program: song-project-server-case
 *@description: 路由判断
 *@author: by song
 *@create: 2019-11-21 10:21
 */

@RestController
@RequestMapping("/five")
public class ZuulFiveController {

    @GetMapping(value="/hello/{name}")
    public String hello(@PathVariable("name") String name){
        return "hello"+name+"this is zuulcontroller----/five/hello";
    }

}
