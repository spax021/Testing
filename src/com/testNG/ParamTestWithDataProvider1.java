package com.testNG;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParamTestWithDataProvider1 {
	
	private PrimeNumberChecker primeNumberChecker;
	
	//napravili smo objekat
	@BeforeMethod
	public void init(){
		primeNumberChecker = new PrimeNumberChecker();
	}
	
	//ovde su ubacene vrednosti, logicno "DataProvider"
	@DataProvider(name = "test1") //ovim je mapiran pod imenom test1
	public static Object[][] primeNumbers(){
		return new Object[][] {{2, true}, {6, false}, {19, true}, {22, false}, {23, true}};
	}
	
	@Test(dataProvider = "test1")
	public void testPrimeNumberChechker(Integer inputNumber, boolean expectedResult){
		System.out.println(inputNumber + " " + expectedResult);
		Assert.assertEquals(expectedResult, primeNumberChecker.validate(inputNumber));
	}

}
