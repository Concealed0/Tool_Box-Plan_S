package com.histone.song.portal.controller;
/**
 * @ProjectName: song-project-server-case
 * @Package: com.histone.song.portal.controller
 * @ClassName: DemoFeignRest
 * @Author: dongsong
 * @Description: 消费者使用生产者接口
 * @Date: 2019/11/13 11:46
 * @Version: 1.0
 */

import com.histone.song.demo.api.DemoFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *@program: song-project-server-case
 *@description: 消费者使用生产者接口
 *@author: by song
 *@create: 2019-11-13 11:46
 */

@RestController
public class DemoFeignRest {

    @Autowired
    private DemoFeign demoFeign;

    @RequestMapping(value="/server")
    public String demo (@RequestParam("message") String message){
        return demoFeign.demo(message);
    }

}
