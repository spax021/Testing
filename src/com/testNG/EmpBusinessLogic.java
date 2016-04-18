package com.testNG;

public class EmpBusinessLogic {
	
	public double izracunajGodisnjuZaradu(EmployeeDetails employeeDetails){
		double godisnjaZarada = 0;
		godisnjaZarada = employeeDetails.getPlata() * 12;
		return godisnjaZarada;
	}
	
	public double izracunajProcenu(EmployeeDetails employeeDetails){
		
		double procena = 0;
		
		if(employeeDetails.getPlata() < 1000){
			procena = 500;
		}else{
			procena = 1000;
		}
		return procena;
	}

}
