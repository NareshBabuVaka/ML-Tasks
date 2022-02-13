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

	// Fetching the Employee Table Data:
	@Override
	public void retrivingDepartmentData() {
		String connectionUrl = "jdbc:sqlserver://localhost:1433;databaseName=Naresh;userName=sa;password=Bhavna@123";

		try {
			System.out.println("Fetching the Records From the Dep Table: ");
			System.out.println();
			Connection connection = DriverManager.getConnection(connectionUrl);

			Statement statement = connection.createStatement();
			System.out.println("Enter the Select Query to Fetch the Department Table Data");
			String fetchingEmpDataQuery = scanner.nextLine();

			// String fetchingEmpQuery="SELECT * FROM EMPLOYEE_TABLE";

			ResultSet resultSet = statement.executeQuery(fetchingEmpDataQuery); // Executing Select the Query
			System.out.println("DEPTID\t" + "DEPTNAME\t");
			System.out.println("===================");
			while (resultSet.next()) {
				System.out.println(resultSet.getString(1) + "\t" + resultSet.getString(2));
			}
			System.out.println();
			System.out.println("Records Fetched from the Dept Table! ");

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

	// Fetching the Employee Table Data:
	@Override
	public void retrivingEmployeeData() {
		String connectionUrl = "jdbc:sqlserver://localhost:1433;databaseName=Naresh;userName=sa;password=Bhavna@123";

		try {
			System.out.println("Fetching the Records From the Emp Table: ");
			System.out.println();
			System.out.println("Enter the Select Query to Fetch the Employement Table Data");
			String fetchingEmpDataQuery = scanner.nextLine();

			// String fetchingEmpQuery="SELECT * FROM EMPLOYEE_TABLE";

			Connection connection = DriverManager.getConnection(connectionUrl);

			Statement statement = connection.createStatement();

			ResultSet resultSet = statement.executeQuery(fetchingEmpDataQuery); // Executing Select the Query
			System.out.println("EMPID\t\tEMPNAME\t\tEMPSAL\t\tDOJ\t\tDEPTID");
			System.out.println("==========================================================================");
			while (resultSet.next()) {
				System.out.println(resultSet.getString(1) + "\t\t" + resultSet.getString(2) + "\t\t"
						+ resultSet.getString(3) + "\t" + resultSet.getString(4) + "\t" + resultSet.getString(5));
			}
			System.out.println();
			System.out.println("Records Fetched from the Emp Table! ");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

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
			System.out.println("Record was inserted successfully! ");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

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
			System.out.println("Record was inserted successfully! ");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void updatingEmployeeTable() {
		String connectionUrl = "jdbc:sqlserver://localhost:1433;databaseName=Naresh;userName=sa;password=Bhavna@123";

		try {

			Connection connection = DriverManager.getConnection(connectionUrl);
			Statement statement = connection.createStatement();
			// String updateQuery = "UPDATE EMPLOYEE_TABLE SET ENAME=\'Naresh\' WHERE
			// EMPID=101";

			System.out.println("Enter a query to update the records in emp  table...");
			String updateQuery = scanner.nextLine();

			statement.executeUpdate(updateQuery);
			System.out.println();
			System.out.println("ONE RECORD IS UPDATED! ");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void updatingDepartmentTable() {
		String connectionUrl = "jdbc:sqlserver://localhost:1433;databaseName=Naresh;userName=sa;password=Bhavna@123";

		try {

			Connection connection = DriverManager.getConnection(connectionUrl);
			Statement statement = connection.createStatement();
			// String updateQuery = "UPDATE DEPARTMENT_TABLE SET DEPTNAME=\'Naresh\' WHERE
			// DEPTID=101";
			System.out.println("Enter a query to update the records in dept table...");
			String updateQuery = scanner.nextLine();

			statement.executeUpdate(updateQuery);
			System.out.println("ONE RECORD IS UPDATED! ");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void employeeCount() {
		String connectionUrl = "jdbc:sqlserver://localhost:1433;databaseName=Naresh;userName=sa;password=Bhavna@123";

		try {
			Connection connection = DriverManager.getConnection(connectionUrl);
			Statement callablestatement = connection.createStatement();

			String query = "select deptName,count(*) as num from DEPARTMENT_TABLE d inner join EMPLOYEE_TABLE e on e.DEPTID=d.DEPTID where EMPSAL>=24000 group by DEPTNAME";
			ResultSet resultset = callablestatement.executeQuery(query);
			while (resultset.next()) {
				System.out.println(resultset.getString(1) + " " + resultset.getString(2));
			}
			System.out.println();
			System.out.println("Query is Executed Successfully: ");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void selectYourChoice() {

		while (true) {

			System.out.println("Press 1 to Create the Emp Table in the Database: ");
			System.out.println("Press 2 to Create the Dept Table in the Database: ");
			System.out.println("Press 3 to Fetch the Data From Emp Table: ");
			System.out.println("Press 4 to Fetch the Data From Dept Table: ");
			System.out.println("Press 5 to Insert the Data into Emp Table: ");
			System.out.println("Press 6 to Insert the Data into Dept Table: ");
			System.out.println("Press 7 to Update the Data in the Emp Table: ");
			System.out.println("Press 8 to Update the Data in the Dept Table: ");
			System.out.println(
					"Press 9 to Count the Number of Employees Group by Department Name and Greater Than 30000 Salary:");
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
				System.out.println("Please Provide a Valid Option: ");
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
