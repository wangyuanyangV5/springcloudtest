package com.example.wang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Created by dell on 2019/2/19.
 */
@SpringBootApplication
@EnableFeignClients
public class MyFeign {
    public static void main(String[] args) {
        SpringApplication.run(MyFeign.class,args);
    }
}
