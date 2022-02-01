package com.bhavna.main;

import com.bhavna.zipservice1.ZipService1;
import com.bhavna.zipservice2.ZipService2;

public class MainClass {

	public static void main(String[] args) {

		ZipService1 zipservice1 = new ZipService2(); // creating the object for zipservice2

		zipservice1.getByChoice();

	}

}
