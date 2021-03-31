package com.tcn.business.portal.producer;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


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
