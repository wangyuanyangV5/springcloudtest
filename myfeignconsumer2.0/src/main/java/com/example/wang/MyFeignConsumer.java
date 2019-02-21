package com.example.wang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Created by dell on 2019/2/21.
 */
@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
public class MyFeignConsumer {

    public static void main(String[] args) {
        SpringApplication.run(MyFeignConsumer.class,args);
    }
}
