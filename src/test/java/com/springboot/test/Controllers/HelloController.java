package com.springboot.test.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String handle01(){
        System.out.println("test333229999"); 
        System.out.println("test333229999");
        return "Hello, Spring Boot!!!!";
    }
}
