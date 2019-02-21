package com.example.wang.config.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;


/**
 * 开放跨域配置
 * Created by tudou on 2017/4/21.
 */
@Configuration
public class CorsConfig {

    private CorsConfiguration buildConfig() {
        CorsConfiguration corsConfiguration = new CorsConfiguration();
        corsConfiguration.addAllowedOrigin("*");//允许任何域名使用
        corsConfiguration.addAllowedHeader("*");//允许任何头
        corsConfiguration.addAllowedMethod("*");//允许任何方法
        return corsConfiguration;
    }

    @Bean
    public CorsFilter corsFilter() {
        //注册CORS过滤器
            UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", buildConfig());
        return new CorsFilter(source);
    }
}
