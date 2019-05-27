package com.springboot.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.starter.autoconfig.HelloService;

@RestController
public class EmployeeController {

    @Autowired
    HelloService helloService;

    @RequestMapping("qeid")
    @ResponseBody
    public String queryByID() {
        System.out.println("员工查询成功！！！！");

        return  helloService.sayHello("beijing");
    }
}
