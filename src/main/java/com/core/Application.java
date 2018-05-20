package com.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Create by LiuXinCheng on 2018/5/20
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = "com")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
