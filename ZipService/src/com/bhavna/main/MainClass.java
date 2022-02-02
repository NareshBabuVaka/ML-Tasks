//
//Design a zip lookup service that takes the zip code as an input parameter and returns the corresponding details.
//prerequisites:
//1. Create a multi-level class (parent-child), adding attributes(address information) of all types String, int, long, Date
//parent-child relationship like Country -> State -> Area(zip)
//2. In order to do the operation creates two separate classes ZipServicev1(base) and ZipServicev2(child of v1)
//3. Create a main class and do the operation(get, set, print)
//4. Think of using polymorphism, inheritance, abstraction & encapsulation
//5. use the collection as in memory to keep the data
//6. Use loop/iterator to print all record
//7. Use of interface, static method, any validation will be appreciated

package com.bhavna.main;

import com.bhavna.zipservice1.ZipService1;
import com.bhavna.zipservice2.ZipService2;

public class MainClass {

	public static void main(String[] args) {

		ZipService1 zipservice1 = new ZipService2(); // creating the object for zipservice2...

		zipservice1.getByChoice();

	}

}
