package com.test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestTwo {
	
	@BeforeTest
	public void beforeTest(){
		System.out.println("Before test");
	}
	
	@Test
	public void testFour(){
		System.out.println("Testiram cetvorku");
	}

}
