package com.test.singleton;

public class SingletonTest {
	private static SingletonTest instance = null;

	private SingletonTest() {
		
	}

	public static SingletonTest getInstance() {
		if (instance == null) {
			synchronized (SingletonTest.class) {
				if (instance == null) {
					instance = new SingletonTest();
				}

			}

		}
		return instance;

	}
	protected static void printTestMethod(){
		System.out.println("instance of "+instance);
	}

	
}
