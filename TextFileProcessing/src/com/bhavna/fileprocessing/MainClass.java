//A text file processor, that works on validation(custom exception). That file contains the data in the below format it's basically a user activity feed of the number of times logged in on a particular day.
//
//Tab-separated (a.txt)
//Mehneen 01/29 3:00 PM
//Rahul   01/29 3:10 PM
//Mehneen 01/29 3:25 PM
//
//process this file and put the data in the suitable map-based collection Map< K, List<Object>>. Use appropriate key along with remaining information to be kept in the list of custom POJO. Finally, return the map of success and failure (suitable reason), considering the failure of one shouldn't stop other processing.

package com.bhavna.fileprocessing;

import com.bhavna.exceptions.OwnExceptions;
import com.bhavna.service.LoginService;

public class MainClass {

	public static void main(String[] args) {
		LoginService loginservice = new LoginService();
		try {
			loginservice.getByOptions();
		} catch (OwnExceptions e) {
			System.out.println(e.getMessage());
		}

	}

}
