package com.bhavna.zipservice2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Iterator;

import com.bhavna.Area.Area;
import com.bhavna.zipservice1.ZipService1;

public class ZipService2 extends ZipService1 // inheriting the super class
{
	Scanner scanner = new Scanner(System.in);

//	ZipService2  ser2= new ZipService2(); //creating the object for zipservice2

	Map<Integer, Area> map = new HashMap<>(); // using the map to store the values....
	{
		map.put(522256, new Area("India", "Andhra Pradesh", "Guntur", 522256));
		map.put(522257, new Area("India", "Andhra Pradesh", "Krishna", 522257));
		map.put(522258, new Area("India", "Andhra Pradesh", "Nellore", 522258));
		map.put(522250, new Area("India", "Andhra Pradesh", "Vizag", 522250));
		map.put(522252, new Area("India", "Andhra Pradesh", "Tirupathi", 522252));
		map.put(522253, new Area("India", "Andhra Pradesh", "Vijayanagaram", 522253));
		map.put(522259, new Area("India", "Andhra Pradesh", "East Godavari", 522259));
		map.put(522251, new Area("India", "Andhra Pradesh", "West Godvari", 522251));

	}

	@Override
	public void printDetails() // print details method for printing all details...//polymorphisam
	{

		Iterator<Map.Entry<Integer, Area>> itr = map.entrySet().iterator();// using iterator for iterating the records..

		while (itr.hasNext()) // itr.hasnext method will returns boolean values..
		{
			Map.Entry<Integer, Area> entry = itr.next(); // it stores the records one by one in entry
			System.out.println(entry.getValue()); // getting the records by using entry.getvalue method..
		}

	}

	@Override
	public void getByPinCode(int pinCode) // getting the values by pin code...
	{

		if (map.containsKey(pinCode)) {
			System.out.println(map.get(pinCode));
		} else {
			System.out.println("Please enter correct pin code...");
		}
	}

	@Override
	public void savaDetails() {

		System.out.println("Please Enter your country name: ");
		String countryName = scanner.next();

		System.out.println();

		System.out.println("Please enter your state name: ");
		String stateName = scanner.next();

		System.out.println();

		System.out.println("Please enter your area name: ");
		String areaName = scanner.next();

		System.out.println();

		System.out.println("Please Enter your pincode: ");
		Integer pinCode = scanner.nextInt();

		System.out.println();

		map.put(pinCode, new Area(countryName, stateName, areaName, pinCode));

		System.out.println();

		System.out.println("YOur details are saved successfully...");

	}

	@Override
	public void getByChoice() {

		String str;
		do {
			System.out.println("If you want to get the address by entering the pincode please enter 1: ");
			System.out.println("If you want all the available records  please enter 2: ");
			System.out.println("If you want to save the new records please enter 3: ");

			int n = scanner.nextInt();

			switch (n) {
			case 1:
				System.out.println("Please enter pin code: ");
				int n1 = scanner.nextInt();
				getByPinCode(n1);
				break;
			case 2:
				printDetails();
				break;
			case 3:
				savaDetails();

				break;
			default:
				System.out.println("Please enter correcrt nmber...");
			}

			System.out.println();
			System.out.println();
			System.out.println("Do you want to continue: Enter Y");

			str = scanner.next();

		} while (str.equalsIgnoreCase("y"));
	}
}
