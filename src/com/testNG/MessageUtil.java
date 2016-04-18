package com.testNG;

public class MessageUtil {

	private String message;
	
	public MessageUtil(String message){
		this.message = message;
	}
	
	public String ispisiPoruku(){
		System.out.println(message);
		return message;
	}
	
//	public String dodavanjePoruke(){
//		message = "Hi" + message;
//		System.out.println(message);
//		return message; 
//	}
	
	public String dodavanjePoruke(){
		message = "tutorialspoint" + message;
		System.out.println(message);
		return message; 
	}
	
	public String exitMessage(){
		message = "www." + message;
		System.out.println(message);
		return message;
	}
	
}
