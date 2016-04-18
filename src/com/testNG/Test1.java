package com.testNG;


import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 {

	String poruka = "Spasoje";
	MessageUtil messageUtil = new MessageUtil(poruka);
	
	@Test
	public void testJedan(){
		System.out.println("Unutar ispisPoruku()");
		Assert.assertEquals(poruka, messageUtil.ispisiPoruku());
	}
	@Test (enabled = false) // (enabled = false) iskljucuje test i ne pokrece ga
	public void testDva(){
		System.out.println("Unutar dodavanjePoruke()");
		poruka = "Hi " + poruka;
		Assert.assertEquals(poruka, messageUtil.dodavanjePoruke());
	}
	
}
