package com.testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTest {
	
	//napravio random string
	private String poruka = "Hello World";
	//prosledio string do konstruktora
	MessageUtil messageUtil = new MessageUtil(poruka);
	
	
	@Test 
	public void testiranje(){
							//actual      expected
		Assert.assertEquals(poruka, messageUtil.ispisiPoruku());
	}

}
