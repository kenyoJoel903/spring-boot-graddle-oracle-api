CREATE OR REPLACE PROCEDURE DELETE_EMPLOYEE(
	   P_EMPLOYEE_ID IN TBL_EMPLEADO.ID%TYPE
)
IS
BEGIN
  DELETE TBL_EMPLEADO where ID = P_EMPLOYEE_ID;
  COMMIT;

END;
/