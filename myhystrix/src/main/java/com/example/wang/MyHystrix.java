package com.example.wang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * Created by dell on 2019/2/25.
 */
@SpringBootApplication
@EnableHystrix
@EnableDiscoveryClient
public class MyHystrix {
    public static void main(String[] args) {
        SpringApplication.run(MyHystrix.class,args);
    }
}
