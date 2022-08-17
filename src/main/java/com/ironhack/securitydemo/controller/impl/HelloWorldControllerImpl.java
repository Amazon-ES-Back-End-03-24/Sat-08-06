package com.ironhack.securitydemo.controller.impl;

import com.ironhack.securitydemo.controller.dto.PostTestDTO;
import com.ironhack.securitydemo.controller.interfaces.HelloWorldController;
import com.ironhack.securitydemo.security.CustomUserDetails;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldControllerImpl implements HelloWorldController {

    @GetMapping("/hello/{name}/world")
    public String helloWorld(@PathVariable String name) {
        return "Hello " + name + " :D";
    }

    @GetMapping("/goodbye/{name}/world")
    public String goodbyeWorld(@PathVariable String name) {
        return "Goodbye " + name +" D:";
    }

    @PostMapping("/hello-post")
    public String postTest(@RequestBody PostTestDTO postTestDTO) {
        return "Hello " + postTestDTO.getName();
    }

    @GetMapping("/say-hello")
    public String sayHello(@AuthenticationPrincipal CustomUserDetails userDetails) {
        return "Welcome, " + userDetails.getUsername();
    }

}
