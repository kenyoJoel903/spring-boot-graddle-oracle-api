CREATE OR REPLACE PROCEDURE ADD_EMPLOYEE (  
   employee_id IN TBL_EMPLEADO.ID%TYPE,
   employee_birthday IN TBL_EMPLEADO.FECHANACI%TYPE,
   employee_name IN TBL_EMPLEADO.NOMBRE%TYPE,
   employee_salary IN TBL_EMPLEADO.SALARIO%TYPE,
   employee_updated IN TBL_EMPLEADO.ACTUALIZADO%TYPE,
   employee_worked_days IN TBL_EMPLEADO.DIAS_TRABAJADOS%TYPE
)    
IS  
BEGIN  
INSERT INTO TBL_EMPLEADO (ID,FECHANACI, NOMBRE, SALARIO, ACTUALIZADO, DIAS_TRABAJADOS)  
VALUES (employee_id, employee_birthday, employee_name, employee_salary, employee_updated, employee_worked_days);  
COMMIT;  
END;  
/ 