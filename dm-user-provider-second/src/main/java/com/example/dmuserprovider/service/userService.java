package com.example.dmuserprovider.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
public class userService {

    private Logger logger = LoggerFactory.getLogger(userService.class);

    @GetMapping(value = "/login")
    public String login(@RequestParam("count") int count){
        logger.info("login----2--"+count);
        System.out.println("login----2--"+count);
        return "用户验证登陆";
    }

    @RequestMapping(value = "/loginSecond",method = RequestMethod.GET)
    public String loginSecond(){ return "用户验证登录验证2"; }
    /*@RequestMapping(value = "/login",method = RequestMethod.GET)
    public boolean login(@RequestParam("name") String name){
        return "root".equals(name);
    }*/
}
