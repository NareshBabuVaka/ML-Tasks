//A text file processor, that works on validation(custom exception). That file contains the data in the below format it's basically a user activity feed of the number of times logged in on a particular day.
//
//Tab-separated (a.txt)
//Mehneen 01/29 3:00 PM
//Rahul   01/29 3:10 PM
//Mehneen 01/29 3:25 PM
//
//process this file and put the data in the suitable map-based collection Map< K, List<Object>>. Use appropriate key along with remaining information to be kept in the list of custom POJO. Finally, return the map of success and failure (suitable reason), considering the failure of one shouldn't stop other processing.




package com.bhavna.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.bhavna.exceptions.OwnExceptions;
import com.bhavna.filenames.MethodDetails;
import com.bhavna.pojo.LoginData;

public class LoginService extends MethodDetails {
	Map<String, List<LoginData>> map = new HashMap<>();

	@Override
	public void textFileProcessing() throws OwnExceptions, IOException {
		File file = new File("details.txt");

		FileReader filereader = new FileReader(file);
		BufferedReader bufferrd = new BufferedReader(filereader);
		String str;

		while ((str = bufferrd.readLine()) != null) {
			String[] starr = str.split("\n");
			for (String s : starr) {
				s = s.replaceAll("\\s{2,}", " ").trim();
				String[] stringDate = s.split("\\s");

				if (map.containsKey(stringDate[1])) {
					List<LoginData> ld = map.get(stringDate[1]);
					ld.add(new LoginData(stringDate[0], stringDate[1], stringDate[2]));
					map.put(stringDate[1], ld);

				} else {
					List<LoginData> ld2 = new ArrayList<>();
					ld2.add(new LoginData(stringDate[0], stringDate[1], stringDate[2]));
					map.put(stringDate[1], ld2);
				}
			}
		}
		bufferrd.close();

	}

	@Override
	public void personLoginDetails(String date) throws OwnExceptions {
		try {
			if (map.containsKey(date)) {
				System.out.println(map.get(date));

			} else {
				throw new OwnExceptions("Enterd details are incorrect. Please enter correct details...");
			}
		} catch (OwnExceptions e) {
			System.out.println(e.getMessage());
		}

	}

	@Override
	public void PersonLoginCount(String date) throws OwnExceptions {
		if (map.containsKey(date)) {
			System.out.println(map.get(date).size());
		} else {
			throw new OwnExceptions("Enterd details are incorrect. Please enter correct details...");
		}

	}

	@Override
	public void AllPersonDetails() {
		for (Map.Entry<String, List<LoginData>> m : map.entrySet()) {
			System.out.println(m.getKey());
			System.out.println("No of logins in this date : " + m.getValue().size());
			System.out.println(m.getValue());
			System.out.println();
		}

	}

	@Override
	public void getByOptions() throws OwnExceptions {
		Scanner scanner = new Scanner(System.in);

		LoginService ls = new LoginService();
		try {
			ls.textFileProcessing();
		} catch (OwnExceptions | IOException e) {
			System.out.println(e.getMessage());
		}

		while (true) {

			System.out.println("if you want to know no of persons logged in a perticular date press 1 : ");
			System.out.println("if you want to know get the details of no of persons logged in a perticular date press 2 : ");
			System.out.println("if you want to know the data of all details on all dates press 3 : ");
			
			System.out.println();

			System.out.println("Please enter your choice: ");
			int cases = scanner.nextInt();
			String date = "";

			try {
				switch (cases) {
				case (1):
					System.out.println("Enter the date in MM/DD format");
					date = scanner.next();
					try {
						ls.PersonLoginCount(date);
					} catch (OwnExceptions e1) {
						System.out.println(e1.getMessage());
					}
					break;

				case (2):
					System.out.println("Enter the date in MM/DD format");
					date = scanner.next();
					try {
						ls.personLoginDetails(date);
					} catch (OwnExceptions e) {
						System.out.println(e.getMessage());
					}
					break;

				case (3):
					ls.AllPersonDetails();
					break;

				default:
					throw new OwnExceptions("Enterd details are incorrect. Please enter correct details...");

				}
			} catch (OwnExceptions e) {
				System.out.println(e.getMessage());
			}

			System.out.println();
			System.out.println("Do you want to continue enter Y ");
			String str = scanner.next();
			if (!str.equalsIgnoreCase("y")) {
				break;
			}

		}

		scanner.close();

	}

}
