package com.example.wang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by dell on 2019/2/22.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class MyRibbon {
    public static void main(String[] args) {
        SpringApplication.run(MyRibbon.class, args);
    }
}
