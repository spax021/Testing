package com.testNG;

import org.testng.annotations.Test;
import org.testng.Assert;

public class TestEmployeeDetails {

	EmpBusinessLogic empBusinessLogic = new EmpBusinessLogic();
	EmployeeDetails employeeDetails = new EmployeeDetails();
	
	@Test
	public void testProcena(){
		
		employeeDetails.setIme("Spasoje");
		employeeDetails.setPlata(600);
		employeeDetails.setStarost(27);
		
		double procena = empBusinessLogic.izracunajProcenu(employeeDetails);
		Assert.assertEquals(500, procena, 0.0, "500");
		
		
	}
	
	@Test
	public void testZarade(){
		
		employeeDetails.setIme("Aleksandra");
		employeeDetails.setPlata(10000);
		employeeDetails.setStarost(27);
		
		double zarada = empBusinessLogic.izracunajGodisnjuZaradu(employeeDetails);
		Assert.assertEquals(120300, zarada, 1000.0, "Mesecno 10.000");
	}
	
}
