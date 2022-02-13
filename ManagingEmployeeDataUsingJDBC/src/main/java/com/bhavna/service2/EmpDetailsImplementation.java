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

package com.bhavna.service2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.bhavna.service1.EmployeeInformation;

public class EmpDetailsImplementation extends EmployeeInformation {

	Scanner scanner = new Scanner(System.in);

	@Override
	public void creatingDepartmentTable() {
		String connectionUrl = "jdbc:sqlserver://localhost:1433;databaseName=Naresh;userName=sa;password=Bhavna@123";
		try {
			Connection connection = DriverManager.getConnection(connectionUrl);
			Statement statement = connection.createStatement();

			String query1 = "CREATE TABLE DEPARTMENT_TABLE(DEPTID BIGINT PRIMARY KEY,DEPTNAME VARCHAR(50))";
			// statement.execute("drop table DEPARTMENT_TABLE");
			statement.execute(query1);
			System.out.println();
			System.out.println("Department table is created successfully...");

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void creatingEmployeeTable() {
		String connectionUrl = "jdbc:sqlserver://localhost:1433;databaseName=Naresh;userName=sa;password=Bhavna@123";
		try {
			Connection connection = DriverManager.getConnection(connectionUrl);
			Statement statement = connection.createStatement();

			String query2 = "CREATE TABLE EMPLOYEE_TABLE(EMPID BIGINT,EMPNAME VARCHAR(50),EMPSAL MONEY, DOJ DATE,DEPTID BIGINT FOREIGN KEY REFERENCES DEPARTMENT_TABLE(DEPTID))";
			statement.execute(query2);

			System.out.println();
			System.out.println("Employee table is created successfully...");

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	// This method is fetching the department table data:
	@Override
	public void retrivingDepartmentData() {
		String connectionUrl = "jdbc:sqlserver://localhost:1433;databaseName=Naresh;userName=sa;password=Bhavna@123";

		try {
			System.out.println(" Here it is Fetching the Records From the Department Table: ");
			System.out.println();
			Connection connection = DriverManager.getConnection(connectionUrl);

			Statement statement = connection.createStatement();
			System.out.println("Enter the  Query to retrive the Department Table Data...");
			String fetchingEmpDataQuery = scanner.nextLine();

			System.out.println();
			ResultSet resultSet = statement.executeQuery(fetchingEmpDataQuery);
			System.out.println("DEPTID\t" + "DEPTNAME\t");
			System.out.println("**********************");
			while (resultSet.next()) {
				System.out.println(resultSet.getString(1) + "\t" + resultSet.getString(2));
			}
			System.out.println();
			System.out.println("Here are the records from department table that you want... ");

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

	// This method is fetching the Employee table Data:
	@Override
	public void retrivingEmployeeData() {
		String connectionUrl = "jdbc:sqlserver://localhost:1433;databaseName=Naresh;userName=sa;password=Bhavna@123";

		try {
			System.out.println(" Here it is Fetching the Records From the employee Table: ");
			System.out.println();
			System.out.println("Enter the  Query to retrive  the Employement Table Data...");
			String fetchingEmpDataQuery = scanner.nextLine();

			Connection connection = DriverManager.getConnection(connectionUrl);

			Statement statement = connection.createStatement();

			ResultSet resultSet = statement.executeQuery(fetchingEmpDataQuery);
			System.out.println("EMPID\t\tEMPNAME\t\tEMPSAL\t\tDOJ\t\tDEPTID");
			System.out.println("**********************************************************************");
			while (resultSet.next()) {
				System.out.println(resultSet.getString(1) + "\t\t" + resultSet.getString(2) + "\t\t"
						+ resultSet.getString(3) + "\t" + resultSet.getString(4) + "\t" + resultSet.getString(5));
			}
			System.out.println();
			System.out.println("Here are the records from employee table that you want... ");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

	// This method is inserting the data into employee table:
	@Override
	public void insertIntoEmployeeTable() {
		String connectionUrl = "jdbc:sqlserver://localhost:1433;databaseName=Naresh;userName=sa;password=Bhavna@123";
		try {
			Connection connection = DriverManager.getConnection(connectionUrl);
			Statement statement = connection.createStatement();

			System.out.print("Enter empId: ");
			int empId = scanner.nextInt();
			scanner.nextLine();
			System.out.print("Enter empName: ");
			String empName = scanner.nextLine();
			System.out.print("Enter empSalary: ");
			double sal = scanner.nextDouble();
			scanner.nextLine();
			System.out.print("Enter empDateOfJoining: ");
			String date = scanner.nextLine();
			System.out.print("Enter deptId: ");
			int deptId = scanner.nextInt();
			scanner.nextLine();
			String insertQuery = "INSERT INTO EMPLOYEE_TABLE VALUES(" + empId + ",\'" + empName + "\'," + sal + ",\'"
					+ date + "\'," + deptId + ")";
			statement.executeUpdate(insertQuery);
			System.out.println();
			System.out.println("The entered records are saved successfully...! ");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	// This method is inserting the data into department table:
	@Override
	public void insertIntoDepartmentTable() {
		String connectionUrl = "jdbc:sqlserver://localhost:1433;databaseName=Naresh;userName=sa;password=Bhavna@123";

		try {

			Connection connection = DriverManager.getConnection(connectionUrl);
			Statement statement = connection.createStatement();
			System.out.print("Enter deptId: ");
			int deptId = scanner.nextInt();
			scanner.nextLine();
			System.out.print("Enter deptName: ");
			String deptName = scanner.nextLine();

			String insertQuery = "INSERT INTO DEPARTMENT_TABLE VALUES(" + deptId + ",\'" + deptName + "\')";
			statement.executeUpdate(insertQuery);
			System.out.println();
			System.out.println("The entered records are saved successfully...! ");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	// This method is updating the employee table:

	@Override
	public void updatingEmployeeTable() {
		String connectionUrl = "jdbc:sqlserver://localhost:1433;databaseName=Naresh;userName=sa;password=Bhavna@123";

		try {

			Connection connection = DriverManager.getConnection(connectionUrl);
			Statement statement = connection.createStatement();

			System.out.println("Enter a query to update the records in employee  table...");
			String updateQuery = scanner.nextLine();

			statement.executeUpdate(updateQuery);
			System.out.println();
			System.out.println("The changed record is updated successfully... ");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	// This method is updating the department table:

	@Override
	public void updatingDepartmentTable() {
		String connectionUrl = "jdbc:sqlserver://localhost:1433;databaseName=Naresh;userName=sa;password=Bhavna@123";

		try {

			Connection connection = DriverManager.getConnection(connectionUrl);
			Statement statement = connection.createStatement();
			System.out.println("Enter a query to update the records in department table...");
			String updateQuery = scanner.nextLine();

			statement.executeUpdate(updateQuery);
			System.out.println("The changed record is updated successfully... ");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	// This method is counting the number of employees whose salary is greater than
	// 24000
	@Override
	public void employeeCount() {
		String connectionUrl = "jdbc:sqlserver://localhost:1433;databaseName=Naresh;userName=sa;password=Bhavna@123";

		try {
			Connection connection = DriverManager.getConnection(connectionUrl);
			Statement callablestatement = connection.createStatement();

			String query = "select deptName,count(*) as num from DEPARTMENT_TABLE d inner join EMPLOYEE_TABLE e on e.DEPTID=d.DEPTID where EMPSAL>=24000 group by DEPTNAME";
			ResultSet resultset = callablestatement.executeQuery(query);
			while (resultset.next()) {
				System.out.println("Number of persons whose salary is greater than 24000 in  department "
						+ resultset.getString(1) + ":" + " " + resultset.getString(2) + "");
			}
			System.out.println();
			System.out.println("The query is executed successfully... ");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// This is the get by choice method
	@Override
	public void selectYourChoice() {

		while (true) {

			System.out.println("If you want to create the employee table in database enter 1:  ");
			System.out.println("If you want to create the department table in database enter 2: ");

			System.out.println("If you want to fetech the data from employee table enter 3: ");
			System.out.println("If you want to fetech the data from department table enter 4: ");

			System.out.println("If you want to insert the data into the employee table press 5:  ");
			System.out.println("If you want to insert the data into the department table press 6:  ");

			System.out.println("If you want to update the data into the employee table press 7:  ");
			System.out.println("If you want to update the data into the department table press 8:  ");
			System.out.println("If you want to Count the Number of Employees Group by Department "
					+ " Name and Greater Than 24000 Salary press 9:");
			System.out.println();
			System.out.println("Please Enter Your Choice: ");
			int option = scanner.nextInt();
			scanner.nextLine();
			switch (option) {
			case 1:
				creatingEmployeeTable();
				System.out.println();
				break;
			case 2:
				creatingDepartmentTable();
				System.out.println();
				break;
			case 3:
				retrivingEmployeeData();
				System.out.println();
				break;
			case 4:
				retrivingDepartmentData();
				System.out.println();
				break;
			case 5:
				insertIntoEmployeeTable();
				System.out.println();
				break;
			case 6:
				insertIntoDepartmentTable();
				System.out.println();
				break;
			case 7:
				updatingEmployeeTable();
				System.out.println();
				break;
			case 8:
				updatingDepartmentTable();
				System.out.println();
				break;
			case 9:
				employeeCount();
				System.out.println();
				break;
			default:
				System.out.println("Entered option is wrong please enter correct option:  ");
				System.out.println();
			}
			System.out.println();

			System.out.println();
			System.out.println("Do you want to continue enter Y ");
			String str = scanner.nextLine();
			if (!str.equalsIgnoreCase("y")) {
				break;
			}

		}
		scanner.close();
	}

}
