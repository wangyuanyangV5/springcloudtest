package com.example.wang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by dell on 2019/2/21.
 */
@SpringBootApplication
@EnableEurekaClient
@EnableSwagger2
public class MyFeignProvider {
    public static void main(String[] args) {
        SpringApplication.run(MyFeignProvider.class,args);
    }
}
