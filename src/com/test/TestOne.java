package com.test;

import org.junit.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestOne {

	public static int i = 0;
	
	@BeforeClass
	public static void beforeClass(){
		System.out.println("@BeforeClass");
		System.out.println("Ova anotacija ce se pozvati samo jednom pre testiranja");
		System.out.println("zato sto smo pokrenuli samo jednu klasu\n");
	}
	
	@BeforeMethod
	public void beforeMethod(){
		System.out.println("@Before - pokrenuce se onoliko puta \nkoliko ima testova(metoda sa anotacijom @test)");
		System.out.println("Otvaram test: " + (i + 1) + ". put.");
	}

	@Test
	public void testOne(){
		i++;
		System.out.println("Testiram: " + i + ". put.");
	}
	@Test
	public void testTwo(){
		i++;
		System.out.println("Testiram: " + i + ". put.");
	}
	@Test
	public void testThree(){
		i++;
		System.out.println("Testiram: " + i + ". put.");
	}
	
	@AfterMethod
	public void aftereMethod(){
		System.out.println("Zatvaram test: " + i + ". put.");
		System.out.println("Kao i sa @Before, isto vazi i za @After anotaciju\n");
	}

}
