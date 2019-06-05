package com.example.dmgatewayzuul.service;

import com.netflix.zuul.ZuulFilter;

public class PreFilter extends ZuulFilter {
    /**之前 运行中 报错 post**/
    @Override
    public String filterType() {
        return "pre";
    }
    /**执行顺序**/
    @Override
    public int filterOrder() {
        return 1;
    }
    /**是否需要该过滤器**/
    @Override
    public boolean shouldFilter() {
        return true;
    }

    /****/
    @Override
    public Object run() {
        return null;
    }
}
