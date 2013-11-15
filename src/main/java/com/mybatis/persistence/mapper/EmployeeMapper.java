package com.mybatis.persistence.mapper;

import com.mybatis.persistence.mapper.md.Employee;


public interface EmployeeMapper {

    public Employee getEmployeeName(long empId);

    public void insertEmployee(Employee employee);

}