package com.syx.mapper;

import com.syx.pojo.Department;
import org.apache.ibatis.annotations.*;

//@Mapper
public interface DepartmentMapper {

    @Options(useGeneratedKeys = true,keyProperty = "id")
    @Insert("insert into department(department_name)  values (#{departmentName})")
    int insertDept(Department department);

    @Select("select * from department where id = #{1}")
    Department selectDept(int id);

    @Delete("delete from department where id =#{1}")
    int deleteById(int id);

    @Update("update department set departmentName=#{department_name} where id=#{id}")
    int updateDept(Department department);

}
