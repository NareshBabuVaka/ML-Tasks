package com.bhavna.Area;

import com.bhavna.State.State;

public class Area extends State {
	String areaName;
	int pinCode;

	// getter setter methods for area
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

	// four parameterized constructor for initializing properties
	public Area(String countryName, String stateName, String areaName, int pincode) {
		super(countryName, stateName); // calling super class constructor...

		// Initializing current class properties...
		this.areaName = areaName;
		this.pinCode = pincode;
	}

	// overriding tostring method to return the data...
	@Override
	public String toString() {
		return " AreaName > :" + areaName + ", pincode > :" + pinCode + ", getStateName() > :" + getStateName()
				+ ", getCountryName() > :" + getCountryName();
	}

}
