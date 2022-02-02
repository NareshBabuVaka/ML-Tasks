
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

package com.bhavna.zipservice1;

public abstract class ZipService1 // abstract class for zipservice1...
{
	// abstract methods...
	abstract public void printDetails();

	abstract public void getByPinCode(int pinCode);

	abstract public void savaDetails();

	abstract public void getByChoice();

}
