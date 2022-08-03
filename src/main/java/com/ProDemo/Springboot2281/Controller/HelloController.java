package com.ProDemo.Springboot2281.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String HelloWorld(){
        return "Hello Ashutosh Sir";
    }
}
