package com.bhavna.pojo;

public class LoginData {
	private String name;
	private String date;
	private String time;

	public LoginData() {
	}

	public LoginData(String name, String date, String time) {
		this.name = name;
		this.date = date;
		this.time = time;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "PersonsLoginData (name= " + name + ",date= " + date + ", time=" + time + ")\n";
	}
}
