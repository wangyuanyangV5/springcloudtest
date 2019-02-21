package com.example.wang.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by dell on 2019/2/19.
 */
@FeignClient(name = "github-client",url = "https://api.github.com")
public interface HelloFeignServiceConfig {

    @RequestMapping(value = "/search/repositories",method = RequestMethod.GET)
    String searchRepo(@RequestParam("q") String queryStr);

}
