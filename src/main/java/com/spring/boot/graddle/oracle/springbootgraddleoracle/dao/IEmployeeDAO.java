package com.spring.boot.graddle.oracle.springbootgraddleoracle.dao;

import com.spring.boot.graddle.oracle.springbootgraddleoracle.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface IEmployeeDAO extends CrudRepository<Employee, Long> {

    @Procedure(name = Employee.Get_all_Employees)
    List<Employee> getAllEmployees();

}