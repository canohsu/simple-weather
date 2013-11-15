package com.mybatis.persistence.mapper;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mybatis.persistence.mapper.md.Employee;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value={"classpath:applicationContext.xml"})
public class testempolyee extends AbstractTransactionalJUnit4SpringContextTests {

    @Autowired
    private EmployeeMapper employeeMapper;

    
    public void insertEmployee(){
        Employee emp = new Employee();
        emp.setEmpid(1);
        emp.setFirstName("Manik");
        emp.setLastName("Magar");
        employeeMapper.insertEmployee(emp);
    }

    @Test
    public void testEmployee(){
        System.out.println("testEmployee");
        Employee emp = employeeMapper.getEmployeeName(1);
        Assert.assertNotNull(emp);
    }

}