package com.testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test2 {

	String poruka = "Spasoje";
	MessageUtil messageUtil = new MessageUtil(poruka);
	
	@Test
	public void testDva(){
		System.out.println("Unutar dodavanjePoruke()");
		poruka = "Hi " + poruka;
		Assert.assertEquals(poruka, messageUtil.dodavanjePoruke());
	}
	
}
