package com.example.wang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by dell on 2019/2/21.
 */
@SpringBootApplication
@EnableEurekaClient
public class MyFeignProvider {
    public static void main(String[] args) {
        SpringApplication.run(MyFeignProvider.class,args);
    }
}
