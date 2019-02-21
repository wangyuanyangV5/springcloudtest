package com.example.wang.rest;
import com.example.wang.service.HelloFeignServiceConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by dell on 2019/2/21.
 */
@RestController
public class MyHelloFeginController {

    @Autowired
    private HelloFeignServiceConfig helloFeignService;

    @GetMapping(value = "/serach/github")
    public String searchGitHubRepoByStr(@RequestParam("str") String str){
        return helloFeignService.searchRepo(str);
    }

}
