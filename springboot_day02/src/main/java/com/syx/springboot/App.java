package com.syx.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.convert.converter.Converter;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

import java.util.Locale;

@SpringBootApplication
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

   @Bean
    public ViewResolver myViewResolver(){
       return new  ViewResolver(){
           @Override
           public View resolveViewName(String viewName, Locale locale) throws Exception {
               return null;
           }
       };
   }

   @Bean
    public Converter myConverter(){
        return new Converter(){
            @Override
            public Object convert(Object source) {
                return null;
            }
        };
   };
}
