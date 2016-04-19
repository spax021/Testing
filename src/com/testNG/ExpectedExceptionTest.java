package com.testNG;

import org.testng.annotations.Test;

public class ExpectedExceptionTest {

	String message = "Spasoje";
	MessageUtil messageUtil = new MessageUtil(message);
	
	
	//zbog zagrade zaobilazi gresku u metodi tj zanemaruje aritmeticke probleme ako postoje
	//i na ovaj nacin proveravam da li test prolazi onako kako zelim
	@Test(expectedExceptions = ArithmeticException.class)
	public void printError(){
		System.out.println("Inside printError()");
		messageUtil.printError();
	}
	
}
