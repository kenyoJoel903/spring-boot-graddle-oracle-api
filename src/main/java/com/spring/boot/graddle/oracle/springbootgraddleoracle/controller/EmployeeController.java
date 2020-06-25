package com.spring.boot.graddle.oracle.springbootgraddleoracle.controller;

import com.spring.boot.graddle.oracle.springbootgraddleoracle.entity.Employee;
import com.spring.boot.graddle.oracle.springbootgraddleoracle.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    @Autowired
    private IEmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> findAllEmployees(){ return employeeService.findAll(); }

}