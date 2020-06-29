package com.example.demo.entity;



import javax.persistence.Temporal;
import javax.persistence.TemporalType;



import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.SequenceGenerator;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.Table;



@NamedStoredProcedureQueries({
        @NamedStoredProcedureQuery(
                name = Employee.obtenerEmplados,
                procedureName = "GET_ALL_EMPLOYEES",
                resultClasses = Employee.class,
                parameters = {
                        @StoredProcedureParameter(mode = ParameterMode.REF_CURSOR, name = "C_EMPLOYEES",  type = Class.class)
                }
        )
})
@Entity
@Table(name = "TBL_EMPLEADO", schema = "efinan")
public class Employee implements Serializable {

    public static final String obtenerEmplados = "listarEmpleados";

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "EMPLOYEE_SEQ")
    @SequenceGenerator(sequenceName = "employee_sequence", allocationSize = 1, name = "EMPLOYEE_SEQ")
    private Long id;
    @Column(name="nombre")
    private String name;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="fechanaci")
    private Date birthday;
    @Column(name="salario")
    private String salary;
    @Column(name="actualizado")
    private Date updated;
    @Column(name="dias_trabajados")
    private String workedDays;



        public Long getId() {
                return this.id;
        }

        public void setId(Long id) {
                this.id = id;
        }

        public String getName() {
                return this.name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public Date getBirthday() {
                return this.birthday;
        }

        public void setBirthday(Date birthday) {
                this.birthday = birthday;
        }

        public String getSalary() {
                return this.salary;
        }

        public void setSalary(String salary) {
                this.salary = salary;
        }

        public Date getUpdated() {
                return this.updated;
        }

        public void setUpdated(Date updated) {
                this.updated = updated;
        }

        public String getWorkedDays() {
                return this.workedDays;
        }

        public void setWorkedDays(String workedDays) {
                this.workedDays = workedDays;
        }
    

    public String toString() {
            return this.name;
    }
}
