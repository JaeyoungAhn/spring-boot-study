package com.spring.springboot.cruddemo.dao;

import com.spring.springboot.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();

}
