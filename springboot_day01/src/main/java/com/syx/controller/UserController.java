package com.syx.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping("quid")
    public void queryByID() {
        System.out.println("用户查询成功！！！！");
    }
}
