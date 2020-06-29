package com.example.demo.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.Employee;

import java.util.List;

@Transactional
public interface IEmployeeDAO extends CrudRepository<Employee, Long> {

    @Procedure(name = Employee.obtenerEmplados)
    List<Employee> getAllEmployees();

}