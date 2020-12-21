package com.histone.song.apollo.controller;
/**
 * @ProjectName: song-project-server-case
 * @Package: com.histone.song.apollo.controller
 * @ClassName: DemoApollo
 * @Author: dongsong
 * @Description:
 * @Date: 2019/11/14 16:08
 * @Version: 1.0
 */


import com.histone.song.apollo.entity.DemoConfig;
import com.histone.song.apollo.entity.RedisConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.scope.refresh.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



/**
 *@program: song-project-server-case
 *@description:
 *@author: by song
 *@create: 2019-11-14 16:08
 */
@RestController
public class DemoApollo {

    private  final static Logger logger= LoggerFactory.getLogger(DemoApollo.class);

    @Value("${redis.cache.clusterNodes}")
    private String clusNode;
    @Autowired
    private RedisConfig redisConfig;
    @Autowired
    private DemoConfig demoConfig;
    @Autowired
    private RefreshScope refreshScope;


    @RequestMapping(value="/apollo")
    public String apollodemo(@RequestParam("message") String message){
        return String.format("zhe shi apollo xiang mu project%s",message);
    }
   @RequestMapping(value="/demo")
    public String getAliveStatus() {
        logger.info("----hello---");
        try {
            refreshScope.refresh("RedisConfig");//可以post请求http://localhost:8888/refresh 代替此行代码
            String s1 = redisConfig.toString();
            System.out.println(s1);
            System.out.println(clusNode);
            return s1;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }



    @RequestMapping("/ceshi")
    public String ceshi(){
        refreshScope.refresh("DemoConfig");
        String demo=demoConfig.toString();
        System.out.println(demo);
        return demoConfig.toString();
    }
}
