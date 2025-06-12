package com.example.cicd_acorn_server2;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hi")
    public String hi(){
        return "hi cicd2 github action ^^";
    }
}
