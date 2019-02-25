package com.example.wang.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Created by dell on 2019/2/25.
 */
@Configuration
public class Configs {

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

    /**
     * 负载均衡策略
     * randomRule 随机策略
     * roundRobinRule 轮询策略
     * RetryRule  重试策略
     * BestAvailableRule 最低并发策略 逐个考察server，如果server断路器打开，则忽略；再选择并发最低的server
     * AvailabilityFilteringRule 可用过滤策略  过滤掉一直连接失败并被标记为circuit tripped的server。过滤掉那些高并发连接的server
     * ResponseTimeWeightedRule 根据server的响应时间分配权重。响应时间越长，权重越低，被选到概率就越低
     * ZoneAvoidanceRule   综合判断server所在区域的性能和server的可用性轮询选择server，并且判定一个AWS Zone的运行性能是否可用
     */

    @Bean
    public IRule ribbonRule(){
        return new RandomRule();
    }

}
