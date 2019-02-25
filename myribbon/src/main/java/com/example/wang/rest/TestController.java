package com.example.wang.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by dell on 2019/2/25.
 */
@RestController
public class TestController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/add")
    public String add(){
        String result = restTemplate.getForObject("http://MY-FEIGN-PROVIDER/user/add",String.class);
        return result;
    }

}
