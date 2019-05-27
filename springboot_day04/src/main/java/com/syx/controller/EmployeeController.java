package com.syx.controller;

import com.syx.mapper.EmployeeMpper;
import com.syx.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EmployeeController {

    @Autowired
    EmployeeMpper employeeMpper;

    @GetMapping("/Employ/{id}")
    @ResponseBody
    public Employee selectEmploy(@PathVariable("id") Integer id){
        return  employeeMpper.selectEmploy(id);
    }


    @GetMapping("/Employ")
    @ResponseBody
    public Employee insertEmploy(Employee employee){
        employeeMpper.insertEmploy(employee);
        return employee;
    }
}
