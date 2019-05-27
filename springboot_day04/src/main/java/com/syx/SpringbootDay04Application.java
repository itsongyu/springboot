package com.syx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//扫描mapper
@MapperScan(value = "com.syx.mapper")
@SpringBootApplication
public class SpringbootDay04Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDay04Application.class, args);
    }

}
