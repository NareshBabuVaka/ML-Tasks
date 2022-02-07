package com.bhavna.filenames;

import java.io.IOException;

import com.bhavna.exceptions.OwnExceptions;

public abstract class MethodDetails {
	abstract public void textFileProcessing() throws OwnExceptions, IOException;

	abstract public void PersonLoginCount(String date) throws OwnExceptions;

	abstract public void personLoginDetails(String date) throws OwnExceptions;

	abstract public void AllPersonDetails();

	abstract public void getByOptions() throws OwnExceptions;

}
