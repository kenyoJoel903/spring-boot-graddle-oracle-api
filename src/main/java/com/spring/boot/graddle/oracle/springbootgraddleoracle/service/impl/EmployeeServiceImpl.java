package com.spring.boot.graddle.oracle.springbootgraddleoracle.service.impl;

import com.spring.boot.graddle.oracle.springbootgraddleoracle.dao.IEmployeeDAO;
import com.spring.boot.graddle.oracle.springbootgraddleoracle.entity.Employee;
import com.spring.boot.graddle.oracle.springbootgraddleoracle.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

    @Autowired
    private IEmployeeDAO employeeDAO;

    @Override
    public List<Employee> findAll() {
        return employeeDAO.getAllEmployees();
    }

    @Override
    public Employee findById(Long id) {
        return null;
    }

    @Override
    public Employee save(Employee employee) {
        return null;
    }

    @Override
    public Employee update(Employee employee) {
        return null;
    }

    @Override
    public Long delete(Long id) {
        return null;
    }
}