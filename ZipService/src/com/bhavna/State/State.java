package com.bhavna.State;

import com.bhavna.Country.Country;

public class State extends Country {
	private String stateName;

	public State(String countryName, String stateName) // two parameterized constructor
	{
		super(countryName); // calling the super class constructor by passing one argument...
		this.stateName = stateName; // initializing non-static property i.e stateName...
	}

	public String getStateName() // getter method
	{
		return stateName;
	}

	public void setStateName(String stateName) // setter method for setting the state name
	{
		this.stateName = stateName;
	}

}
