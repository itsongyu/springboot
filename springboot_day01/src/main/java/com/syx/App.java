package com.syx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * SpringBoot的启动方式SpringBoot的启动方式二
 */
//@ImportResource(value = {"classpath:bean.xml"})//导入spring配置文件
@SpringBootApplication
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

}
