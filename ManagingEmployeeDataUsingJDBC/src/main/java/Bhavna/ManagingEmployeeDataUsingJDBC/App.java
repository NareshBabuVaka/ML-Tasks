package Bhavna.ManagingEmployeeDataUsingJDBC;

import com.bhavna.service1.EmployeeInformation;
import com.bhavna.service2.EmpDetailsImplementation;

public class App {
	public static void main(String[] args) {
		EmployeeInformation ei = new EmpDetailsImplementation();

		ei.selectYourChoice();

	}
}
