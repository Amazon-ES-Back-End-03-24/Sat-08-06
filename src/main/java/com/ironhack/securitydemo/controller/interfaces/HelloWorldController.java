package com.ironhack.securitydemo.controller.interfaces;

import com.ironhack.securitydemo.controller.dto.PostTestDTO;
import com.ironhack.securitydemo.security.CustomUserDetails;

public interface HelloWorldController {

    String helloWorld(String name);

    String goodbyeWorld(String name);

    String sayHello(CustomUserDetails userDetails);
    
    String postTest(PostTestDTO postTestDTO);

}
