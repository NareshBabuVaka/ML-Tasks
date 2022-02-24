/**
 * 1. Create SOAP rent endpoint
 * 2. Get .wsdl response
 * 3. Using SOAP UI send request and get response for created endpoint 
 */
package com.bhavna.service;

import org.springframework.stereotype.Service;

import com.bhavna.student.StudentRequest;
import com.bhavna.student.StudentResponse;

@Service
public class StudentService {

	public StudentResponse studentData(StudentRequest request) {

		StudentResponse studentResponse = new StudentResponse();

		double totalMarks = (request.getEnglishMarks() + request.getHindiMarks() + request.getMathsMarks()
				+ request.getTeluguMarks());

		double averageMarks = (totalMarks / 4);

		double percentage = (totalMarks / request.getMaximumTotalMarks()) * 100;

		studentResponse.setTotalMarks("Your total marks are : " + totalMarks);

		studentResponse.setAverageMarks("Your average marks are : " + averageMarks);

		studentResponse.setPercentage("Your  percentage is : " + percentage);
		if (percentage > 35) {
			studentResponse.setResult("Congratulations you are passed...! you are eligible for  next class");
		} else {
			studentResponse.setResult("Sorry you are failed..Better luck next time...!");
		}
		return studentResponse;

	}
}
