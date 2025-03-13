package com.jspider.singleton;

class Singleton
{
	private Singleton() {}
	
	private static Singleton instance;
	
	public static Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();
		
		}
		return instance;
	}
}

public class SingletonMain {

	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		System.out.println(s1);
		System.out.println(s2);
	}
}
