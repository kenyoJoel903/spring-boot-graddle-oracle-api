package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IEmployeeDAO;
import com.example.demo.dao.ProcedureInvoker;
import com.example.demo.entity.Employee;
import com.example.demo.service.IEmployeeService;

import java.util.List;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

    @Autowired
    private IEmployeeDAO employeeDAO;
    
    @Autowired
    private ProcedureInvoker invoker;

    @Override
    public List<Employee> findAll() {
    	return invoker.findAll();
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