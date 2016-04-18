package com.test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestNGSimpleTest {
   
	String str;
	
	@BeforeMethod
	public void before(){
		str = "TestNG is working fine";
	}
	
	@Test
   public void testAdd() {
      assertEquals("TestNG is working fine", str);
   }
}
