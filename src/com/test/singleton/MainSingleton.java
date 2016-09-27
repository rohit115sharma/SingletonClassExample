package com.test.singleton;

public class MainSingleton {

	
	public static void main(String[] args) 
	{
		
		SingletonTest ti=SingletonTest.getInstance();
		SingletonTest t2=SingletonTest.getInstance();
		ti.printTestMethod();
		t2.printTestMethod();

	}
	

}

