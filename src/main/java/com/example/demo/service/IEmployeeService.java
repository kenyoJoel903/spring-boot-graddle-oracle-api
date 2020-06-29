package com.example.demo.service;


import java.util.List;

import com.example.demo.entity.Employee;

public interface IEmployeeService {
    List<Employee> findAll();
    Employee findById(Long id);
    Employee save(Employee employee);
    Employee update(Employee employee);
    Long delete(Long id);
}