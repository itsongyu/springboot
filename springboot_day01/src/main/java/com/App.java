package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * SpringBoot的启动方式SpringBoot的启动方式一
 */
@ComponentScan(basePackages = "com.springboot.controller")
@EnableAutoConfiguration
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

}
