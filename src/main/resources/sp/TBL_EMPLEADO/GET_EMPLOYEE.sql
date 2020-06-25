create or replace PROCEDURE GET_EMPLOYEE(
	   employee_id IN TBL_EMPLEADO.ID%TYPE,
	   employee_birthday OUT TBL_EMPLEADO.FECHANACI%TYPE,
	   employee_name OUT  TBL_EMPLEADO.NOMBRE%TYPE,
	   employee_salary OUT TBL_EMPLEADO.SALARIO%TYPE,
       employee_updated OUT TBL_EMPLEADO.ACTUALIZADO%TYPE,
       employee_worked_days OUT TBL_EMPLEADO.DIAS_TRABAJADOS%TYPE)
IS
BEGIN

  SELECT FECHANACI, NOMBRE, SALARIO, ACTUALIZADO, DIAS_TRABAJADOS
  INTO employee_birthday, employee_name, employee_salary, employee_updated, employee_worked_days  
  from  TBL_EMPLEADO WHERE ID = employee_id; 

END;
