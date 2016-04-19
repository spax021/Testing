package com.testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParamTestWithDataProvider2 {
	
	
	@DataProvider(name = "test1")
	public static Object[][] primeNumbers(){
		return new Object[][] { {new Bean("Hello, im MR. Bean", 222)}};
	}
	
	@Test(dataProvider = "test1")
	public void testMethod(Bean bean){
		System.out.println(bean.getVal() + " " + bean.getI());
	}

}
