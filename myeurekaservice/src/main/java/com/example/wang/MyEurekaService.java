package com.example.wang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by dell on 2019/2/19.
 */
@SpringBootApplication
@EnableEurekaServer
public class MyEurekaService {
    public static void main(String[] args) {
        SpringApplication.run(MyEurekaService.class,args);
    }
}
