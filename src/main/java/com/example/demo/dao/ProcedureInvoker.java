package com.example.demo.dao;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Employee;

@Repository
public class ProcedureInvoker {

	private final EntityManager entityManager;

	@Autowired
	public ProcedureInvoker(final EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	public List<Employee> findAll() {
		StoredProcedureQuery storedProcedureQuery = entityManager.createStoredProcedureQuery("EFINAN.GET_ALL_EMPLOYEES");
		storedProcedureQuery.registerStoredProcedureParameter(1, Class.class, ParameterMode.REF_CURSOR);
	    storedProcedureQuery.execute();
	    List<Object[]> results = storedProcedureQuery.getResultList();
	    return results.stream()
	    	.map(obj -> {
	    	Employee employee = new Employee();
	    	employee.setId(Long.parseLong(String.valueOf(obj[0])));
	    	employee.setName((String) obj[1]);
	    	employee.setBirthday((Date) obj[2]);
	    	employee.setSalary((String) obj[3]);
	    	employee.setUpdated((Date) obj[4]);
	    	employee.setWorkedDays((String) obj[5]);
	    	return employee;
	    }).collect(Collectors.toList());
	}

}
