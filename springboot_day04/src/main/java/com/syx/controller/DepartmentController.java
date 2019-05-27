package com.syx.controller;

import com.syx.mapper.DepartmentMapper;
import com.syx.pojo.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class DepartmentController {

    @Autowired
    JdbcTemplate JdbcTemplate;

    @Autowired
    DepartmentMapper departmentMapper;

    @GetMapping("/abc")
    public String hello(Model model){
        System.out.println("进入控制层！！！");
        List<Map<String, Object>> list = JdbcTemplate.queryForList("select * from  employee");
        model.addAttribute("msg",String.valueOf(list.get(0)));
        return "index";
    }

    @GetMapping("/dept/{id}")
    @ResponseBody
    public Department selectDept(@PathVariable("id") Integer id){
            return  departmentMapper.selectDept(id);
    }


    @GetMapping("/dept")
    @ResponseBody
    public Department insertDept(Department department){
        departmentMapper.insertDept(department);
        return department;
    }


}
