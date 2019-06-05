package com.example.dmuserconsumer.service;

import org.springframework.stereotype.Component;

@Component
public class UserFeignClientImpl implements UserFeignClient{

    @Override
    public String login() {
        return "服务异常，请稍后重试";
    }

    @Override
    public String loginSecond() {
        return "服务异常请稍后再试2";
    }
}
