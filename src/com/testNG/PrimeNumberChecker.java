package com.testNG;

public class PrimeNumberChecker {

	public boolean validate(Integer primeNumber){
		
		for(int i = 2; i<(primeNumber / 2); i++){
			if(primeNumber % i == 0){
				return false;
			}
		}
		return true;
	}
	
}
