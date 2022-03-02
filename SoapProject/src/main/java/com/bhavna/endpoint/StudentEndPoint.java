/**
 * 1. Create SOAP rent endpoint
 * 2. Get .wsdl response
 * 3. Using SOAP UI send request and get response for created endpoint 
 */

package com.bhavna.endpoint; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.bhavna.service.StudentService;
import com.bhavna.student.StudentRequest;
import com.bhavna.student.StudentResponse;

@Endpoint//for accessing url and get service from http we use this.
public class StudentEndPoint {

	private static final String NAMESPACE = "http://www.bhavna.com/student";
	@Autowired //it will bind two classes
	private StudentService service;

	@PayloadRoot(namespace = NAMESPACE, localPart = "StudentRequest")
	@ResponsePayload
	public StudentResponse getStudentMarks(@RequestPayload StudentRequest request) {
		return service.studentData(request);
	}
}
