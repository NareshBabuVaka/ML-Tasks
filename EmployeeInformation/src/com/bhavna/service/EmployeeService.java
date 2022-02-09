// Create List of Employees. Employee Class Will have Name, Salary & Location fields.*.Using Streams find the employee count whose name starts with "S"
//*.Using Parallel Stream Print all the Employees with location "Hyderabad"
//*.Get Location and employees in that location output : Map<String, List<Employees>> ex : key : "Hyderbad" value : Employees who reside in Hyderabad
//*.Using Streams Check if any Employee's Salary is > 100000
//* Using Lambds's Write a logic to sort EmployeeList based on Name & location"
//

package com.bhavna.service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.bhavna.methodinfo.MethodInfo;
import com.bhavna.pojo.EmployeeInfo;

public class EmployeeService extends MethodInfo {
	List<EmployeeInfo> list;

	@Override
	public void addingEmployeesDetails() {
		list = new ArrayList<>();

		list.add(new EmployeeInfo("Naresh", 25000.00, "Hyderabad"));
		list.add(new EmployeeInfo("Suresh", 30000.00, "Chenni"));
		list.add(new EmployeeInfo("Mahesh", 100000.00, "Mumbai"));
		list.add(new EmployeeInfo("Krishna", 35000.00, "Hyderabad"));
		list.add(new EmployeeInfo("Kondalu", 600000.00, "Bangalore"));
		list.add(new EmployeeInfo("Kishore", 200000.00, "Delhi"));
		list.add(new EmployeeInfo("Bhrath", 90000.00, "Andhra"));
		list.add(new EmployeeInfo("Aravind", 300000.00, "Vizag"));
		list.add(new EmployeeInfo("Sandeep", 33000.00, "Tirupathi"));
		list.add(new EmployeeInfo("Sravan", 80000.00, "Huzurabad"));
		list.add(new EmployeeInfo("Mallik", 88000.00, "Hyderabad"));
		list.add(new EmployeeInfo("Narasimha", 400000.00, "Guntur"));
		list.add(new EmployeeInfo("Sathish", 750000.00, "Vijayawada"));
		list.add(new EmployeeInfo("Anil", 19000.00, "Kerala"));
		list.add(new EmployeeInfo("Chandra", 20000.00, "Goa"));
		list.add(new EmployeeInfo("Abesh", 500000.00, "Surepalli"));
		list.add(new EmployeeInfo("Ranganth", 45000.00, "Padamatipalem"));

	}
	
	
	

	// Using Streams find the employee count whose name starts with "S"

	@Override
	public void getByAlphabetS() {
		addingEmployeesDetails();

		System.out.println("Here we get the Employee count whose name starts with S is : ");

		System.out.println(list.stream().filter(t -> t.getName().startsWith("S")).count());
	}
	
	
	

	// Using Parallel Stream Print all the Employees with location "Hyderabad"

	@Override
	public void getByLocation() {
		addingEmployeesDetails();
		
		System.out.println("Here we get the Employees with location Hyderabad : ");
		System.out.println();

		list.stream().parallel().filter(new Predicate<EmployeeInfo>() {

			@Override
			public boolean test(EmployeeInfo t) {
				if (t.getLocation().contains("Hyderabad")) {
					return true;

				} else {
					return false;
				}
			}
		}).forEach(t -> System.out.println(t));

	}

	
	
	// Get Location and employees in that location
	@Override
	public void getByResidentLocation() {
		addingEmployeesDetails();
		
		System.out.println("Here we get the location and employees in that location : ");
		System.out.println();

		Map<String, List<EmployeeInfo>> map = new HashMap<>();

		map = list.stream().collect(Collectors.groupingBy(EmployeeInfo::getLocation));

		System.out.println("Here we get the Employee details Grouping By Locations: ");

		for (Map.Entry<String, List<EmployeeInfo>> entry : map.entrySet()) {
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());

		}
	}
	
	

	// Using Streams Check if any Employee's Salary is > 100000

	@Override
	public void getBySalaryRange() {
		addingEmployeesDetails();
		
		System.out.println("Here we get employee salary greater than 100000 : ");
		System.out.println();

		list.stream().filter(new Predicate<EmployeeInfo>() {

			@Override
			public boolean test(EmployeeInfo t) {
				if (t.getSalary() > 100000) {
					return true;

				} else {
					return false;
				}
			}
		}).forEach(t -> System.out.println(t));

	}
	
	

	//  Using Lambds's Write a logic to sort EmployeeList based on Name

	@Override
	public void getByName() {
		addingEmployeesDetails();
		
		System.out.println("Here we get the sorted employee list based on their name :");
		System.out.println();

		list.stream().sorted(new Comparator<EmployeeInfo>() {

			@Override
			public int compare(EmployeeInfo e1, EmployeeInfo e2) {
				return (e1.getName()).compareTo(e2.getName());
			}
		}).forEach(t -> System.out.println(t));

	}

	
	
	// Using Lambds's Write a logic to sort EmployeeList based location

	@Override
	public void getByLocationList() {
		addingEmployeesDetails();
		
		System.out.println("Here we get the sorted employee list based on their location :");
		System.out.println();

		list.stream().sorted(new Comparator<EmployeeInfo>() {

			@Override
			public int compare(EmployeeInfo e1, EmployeeInfo e2) {
				return (e1.getLocation()).compareTo(e2.getLocation());
			}
		}).forEach(t -> System.out.println(t));

	}
	
	

	@Override
	public void getByOption() {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("If you want to Find the Employee Count Whose Name Starts with S Enter 1: ");
			System.out.println("If you want to Print all the Employees with Location Hyderabad Enter 2: ");
			System.out.println("If you want to Get the Location and Employees in that Corresponding Location Enter 3: ");
			System.out.println("If you want to Print all the Employees whose Salary is above 100000 Enter 4: ");
			System.out.println("If you want  to Print the Employees in Sorting Order Based on Names Enter 5: ");
			System.out.println("If you want to Print the Employees in Sorting Order Based on Location Enter 6: ");

			System.out.println();
			System.out.print("Please Enter Your Choice: ");
			System.out.println();
			int option = scanner.nextInt();
			switch (option) {
			case 1:
				getByAlphabetS();
				System.out.println();
				break;
			case 2:
				getByLocation();
				System.out.println();
				break;
			case 3:
				getByResidentLocation();
				System.out.println();
				break;
			case 4:
				getBySalaryRange();
				System.out.println();
				break;
			case 5:
				getByName();
				System.out.println();
				break;
			case 6:
				getByLocationList();
				System.out.println();
			default:
				System.out.println("Please Provide a Valid Option: ");
				System.out.println();
			}

			System.out.println();
			System.out.println("Do you want to continue enter Y");
			String str = scanner.next();
			System.out.println();
			if (!str.equalsIgnoreCase("y")) {
				break;
			}

		}
		scanner.close();

	}

}
