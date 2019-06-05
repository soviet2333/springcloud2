package com.example.dmuserconsumer.controller;

import com.example.dmuserconsumer.service.UserFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    private UserFeignClient userFeignClient;

    @RequestMapping("/login")
    public String login(){
        return userFeignClient.login();
    }

    @RequestMapping("/loginSecond")
    public String loginSecond() { return userFeignClient.loginSecond(); }
}
