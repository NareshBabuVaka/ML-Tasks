package com.bhavna.exceptions;

import java.util.NoSuchElementException;

import javax.persistence.EntityNotFoundException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionClass {
	@ExceptionHandler(NoSuchElementException.class)
	public ResponseEntity<String> handleNoSuchElementException(NoSuchElementException noSuchElementException){
		return new ResponseEntity<String>("The data that you are looking is not present in your data base...",HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(EntityNotFoundException.class)
	public ResponseEntity<String> handleEntityNotFoundException(EntityNotFoundException entityNotFoundException){
		return new ResponseEntity<String>("please verify the data that you are enterd. It must and should present in your data base...",HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(NullPointerException.class)
	public ResponseEntity<String> handleNullPointerException(NullPointerException nullPointerException){
		return new ResponseEntity<String>("You have to give all the required fields data it should not be null...",HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(MyException.class)
	public ResponseEntity<String> handleEmptyException(MyException myException){
		return new ResponseEntity<String>("Please provide the quatity greater than or equals to 1... ",HttpStatus.BAD_REQUEST);
	}
}
