package com.spring.springboot.cruddemo.service;

import com.spring.springboot.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();
}
