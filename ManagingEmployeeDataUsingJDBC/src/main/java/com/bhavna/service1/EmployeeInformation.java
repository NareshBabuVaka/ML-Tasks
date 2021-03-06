// 
//Create Employee,Department tables in DB, Should create the relations PrimaryKey ,foreign key
//with these tables and make sure use data types like bigint,varchar,date/datetime.
//* 1.fetch the data emplyeeid,employee name,employee sal,joining date of emp ,deptid, dept name using jdbc
//* 2.save employee and department tables using jdbc
//* 3.updating the employee table using jdbc
//* 4. write a query for find the number of employees in each department
//              whose employee sal greater than 30000.(fetch coulms dept name,count of emplyee)"
//select deptName,count(*) as num from DEPT d inner join EMP e on e.DEPTID=d.DEPTID where ESAL>=3000 group by DEPTNAME
//

package com.bhavna.service1;

public abstract class EmployeeInformation 
{
	abstract public void creatingEmployeeTable();

	abstract public void creatingDepartmentTable();

	abstract public void retrivingEmployeeData();

	abstract public void retrivingDepartmentData();

	abstract public void employeeCount();

	abstract public void insertIntoEmployeeTable();

	abstract public void insertIntoDepartmentTable();

	abstract public void updatingEmployeeTable();

	abstract public void updatingDepartmentTable();

	abstract public void selectYourChoice();

}
