package com.tcn.business.portal.controller;


import com.tcn.business.api.controller.DemoFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DemoFeignRest {

    @Autowired
    private DemoFeign demoFeign;

    @RequestMapping(value="/server")
    public String demo (@RequestParam("message") String message){
        return demoFeign.demo(message);
    }

}
