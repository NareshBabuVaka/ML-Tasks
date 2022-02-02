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

package com.bhavna.Area;

import com.bhavna.State.State;

public class Area extends State {
	String areaName;
	int pinCode;

	// getter setter methods for areaName and pinCode...
	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public int getPincode() {
		return pinCode;
	}

	public void setPincode(int pincode) {
		this.pinCode = pincode;
	}

	// four parameterized constructor for initializing properties...
	public Area(String countryName, String stateName, String areaName, int pincode) {
		super(countryName, stateName); // calling super class constructor...

		// Initializing current class properties...
		this.areaName = areaName;
		this.pinCode = pincode;
	}

	// overriding toString method to return the data...
	@Override
	public String toString() {
		return " AreaName > :" + areaName + ", pincode > :" + pinCode + ", getStateName() > :" + getStateName()
				+ ", getCountryName() > :" + getCountryName();
	}

}
