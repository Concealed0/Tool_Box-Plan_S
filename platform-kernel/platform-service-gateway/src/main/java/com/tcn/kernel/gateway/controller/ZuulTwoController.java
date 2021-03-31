package com.tcn.kernel.gateway.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/two")
public class ZuulTwoController {
    @RequestMapping(value="/hello/{name}")
    public String hello(@RequestParam("name") String name){
        return "hello"+name+"this is zuulcontroller----/two/hello";
    }
}
