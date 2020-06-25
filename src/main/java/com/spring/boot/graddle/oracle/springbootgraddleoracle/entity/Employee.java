package com.spring.boot.graddle.oracle.springbootgraddleoracle.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import oracle.jdbc.OracleType;
import oracle.jdbc.OracleTypes;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@NamedStoredProcedureQueries({
        @NamedStoredProcedureQuery(
                name = Employee.Get_all_Employees,
                procedureName = "GET_ALL_EMPLOYEES",
                resultClasses = Employee.class,
                parameters = {
                        @StoredProcedureParameter(name = "",type = Class.class, mode = ParameterMode.REF_CURSOR)
                }
        )
})
@Table(name = "TBL_EMPLEADO", schema = "REACT")
public class Employee implements Serializable {

    public static final String Get_all_Employees = "GET_ALL_EMPLOYEES";

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "EMPLOYEE_SEQ")
    @SequenceGenerator(sequenceName = "employee_sequence", allocationSize = 1, name = "EMPLOYEE_SEQ")
    private Long id;
    @Column(name="nombre")
    private String name;
    @Column(name="fechanaci")
    private Date birthday;
    @Column(name="salario")
    private String salary;
    @Column(name="actualizado")
    private Date updated;
    @Column(name="dias_trabajados")
    private String workedDays;
}
