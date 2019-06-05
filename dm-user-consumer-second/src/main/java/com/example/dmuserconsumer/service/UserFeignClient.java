package com.example.dmuserconsumer.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "dm-user-provider",fallback = UserFeignClientImpl.class)
public interface UserFeignClient {
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    String login();

    @RequestMapping(value = "/loginSecond",method = RequestMethod.GET)
    String loginSecond();

    /*@RequestMapping(value = "/login",method = RequestMethod.GET)
    boolean login(@RequestParam("name") String name);*/
}
