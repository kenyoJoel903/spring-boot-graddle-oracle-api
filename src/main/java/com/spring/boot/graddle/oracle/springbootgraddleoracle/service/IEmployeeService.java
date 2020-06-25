package com.spring.boot.graddle.oracle.springbootgraddleoracle.service;

import com.spring.boot.graddle.oracle.springbootgraddleoracle.entity.Employee;
import java.util.List;

public interface IEmployeeService {
    List<Employee> findAll();
    Employee findById(Long id);
    Employee save(Employee employee);
    Employee update(Employee employee);
    Long delete(Long id);
}