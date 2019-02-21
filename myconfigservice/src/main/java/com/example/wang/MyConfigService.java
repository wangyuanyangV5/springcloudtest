package com.example.wang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created by dell on 2019/2/19.
 */
@SpringBootApplication
@EnableConfigServer
public class MyConfigService {
    public static void main(String[] args) {
        SpringApplication.run(MyConfigService.class,args);
    }
}
