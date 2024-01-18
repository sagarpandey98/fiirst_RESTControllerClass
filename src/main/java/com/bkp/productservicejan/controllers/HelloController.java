package com.bkp.productservicejan.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//This class will have multiple methods
//that will be serving HTTP Requests at/hello
//This class will be serving Rest (HTTP) APIS
//my server: localhost:8080/hello
@RestController
@RequestMapping("/hello")
public class HelloController {
//    (GET REQUEST @)/hello/say
    @GetMapping("/say/{name}/{number}")
    public String sayHello(@PathVariable("name") String name,
                           @PathVariable("number") int times){
        String answer =  "";
        for(int i = 1; i<=times; i++)
        {
            answer+="Hello" + name;
            answer+="<br>";
        }
        return answer;
    }
}
