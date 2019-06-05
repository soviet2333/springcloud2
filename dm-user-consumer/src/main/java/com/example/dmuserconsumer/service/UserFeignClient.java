package com.example.dmuserconsumer.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "dm-user-provider",fallback = UserFeignClientImpl.class)
public interface UserFeignClient {
    @GetMapping(value = "/login")
    String login(@RequestParam("count") int count);

    @RequestMapping(value = "/loginSecond",method = RequestMethod.GET)
    String loginSecond();

    /*@RequestMapping(value = "/login",method = RequestMethod.GET)
    boolean login(@RequestParam("name") String name);*/
}
