package com.wjj.hellogit;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloContorller {

    @RequestMapping("/")
    public String hello(){
        return "hello git";
    }

}
