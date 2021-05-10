package platform.test.setvice.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class testController {

    @RequestMapping(value="/apolloB")
    public String apollo(@RequestParam("message") String message){
        System.out.println(message);
        return message;
    }
}
