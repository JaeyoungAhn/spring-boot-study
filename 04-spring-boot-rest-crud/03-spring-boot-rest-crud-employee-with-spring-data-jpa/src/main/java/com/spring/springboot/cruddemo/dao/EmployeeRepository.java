package com.spring.springboot.cruddemo.dao;

import com.spring.springboot.cruddemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    // thats's it ... no need to write any code

}
