package com.testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupTest {

	String message = ".com";
	MessageUtil messageUtil = new MessageUtil(message);

	//grupisanje testova, kroz .xml fajl moze da se definise sta tacno da se testira
	//slicno enabled testovima
	
//    <exclude name="functest"/>
//    <include name="checkintest"/>
	
	@Test(groups = { "functest", "checkintest" })
	public void testPrint() {
		System.out.println("unutar ispisiPoruku()");
		message = ".com";
		Assert.assertEquals(message, messageUtil.ispisiPoruku());
	}

	@Test(groups = { "checkintest" })
	public void testSalutationMessage() {
		System.out.println("unutar dodavanjePoruke()");
		message = "tutorialspoint" + ".com";
		Assert.assertEquals(message, messageUtil.dodavanjePoruke());
	}

	@Test(groups = { "functest" })
	public void testingExitMessage() {
		System.out.println("unutar testExitMessage()");
		message = "www." + "tutorialspoint" + ".com";
		Assert.assertEquals(message, messageUtil.exitMessage());
	}

}
