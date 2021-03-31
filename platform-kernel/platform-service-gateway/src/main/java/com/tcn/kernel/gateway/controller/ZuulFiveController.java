package com.tcn.kernel.gateway.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/five")
public class ZuulFiveController {

    @GetMapping(value="/hello/{name}")
    public String hello(@PathVariable("name") String name){
        return "hello"+name+"this is zuulcontroller----/five/hello";
    }

}
