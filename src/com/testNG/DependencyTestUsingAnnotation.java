package com.testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyTestUsingAnnotation {

	String message = "Spasoje";
	MessageUtil messageUtil = new MessageUtil(message);
	
	@Test(groups = { "init" })
	public void testPrintMessage() {
		System.out.println("unutar ispisiPoruku()");
		message = "Spasoje";
		Assert.assertEquals(message, messageUtil.ispisiPoruku());
	}

	@Test (dependsOnGroups = { "init.*" })
	public void testDodavanje() {
		System.out.println("Unutar dodavanjePoruke()");
		message = "tutorialspoint" + "Spasoje";
		Assert.assertEquals(message, messageUtil.dodavanjePoruke());
	}

	@Test(groups = { "init" })
	public void initEnvironmentTest() {
		System.out.println("ovo je initEnvironmentTest()");
	}
	@Test(groups = { "init" })
	public void initEnvironmentTest2() {
		System.out.println("ovo je initEnvironmentTest2()");
	}
	@Test
	public void initEnvironmentTest3() {
		System.out.println("ovo je initEnvironmentTest3()");
	}
	@Test
	public void initEnvironmentTest4() {
		System.out.println("ovo je initEnvironmentTest4()");
	}

}
