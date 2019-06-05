package com.example.dmuserconsumer.controller;

import com.example.dmuserconsumer.service.UserFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    private UserFeignClient userFeignClient;

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String login(){
        for (int i = 0;i < 10;i++) {
            userFeignClient.login(i);
        }
        return "test";
    }

    @RequestMapping("/loginSecond")
    public String loginSecond() { return userFeignClient.loginSecond(); }
}
