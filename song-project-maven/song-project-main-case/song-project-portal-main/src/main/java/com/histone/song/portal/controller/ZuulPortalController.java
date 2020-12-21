package com.histone.song.portal.controller;/**
 * @ProjectName: song-project-server-case
 * @Package: com.histone.song.portal.controller
 * @ClassName: ZuulPortalController
 * @Author: dongsong
 * @Description: 测试网关服务器
 * @Date: 2019/11/21 10:54
 * @Version: 1.0
 */

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *@program: song-project-server-case
 *@description: 测试网关服务器
 *@author: by song
 *@create: 2019-11-21 10:54
 */
@RestController
@RequestMapping("/portal")
public class ZuulPortalController {
    @RequestMapping(value="/hello")
    public String hello(@RequestParam("name") String name){
        return "hello----"+name+"----this is zuul-portal-controller----/portal/hello";
    }

    @RequestMapping(value="/test")
    public String test(@RequestParam("name") String name){
        return "hello-----"+name+"-----------------------/portal/hello";
    }
}
