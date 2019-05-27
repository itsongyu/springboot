package com.syx.mapper;

import com.syx.pojo.Employee;

public interface EmployeeMpper {

    Employee selectEmploy(int id);

    int insertEmploy(Employee employee);
}
