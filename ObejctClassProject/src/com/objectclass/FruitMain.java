package com.objectclass;

class Fruit1
{
	String name;
	int quantity;
	
	Fruit1(String name, int quantity){
		this.name = name;
		this.quantity = quantity;
	}
	
	@Override
	public boolean equals(Object o) {
		Fruit1 f = (Fruit1)o;
		return this.name.equals(f.name) && this.quantity == f.quantity;
	}
}

public class FruitMain {
	public static void main(String[] args) {
		Fruit1 f1 = new Fruit1("apple", 20);
		Fruit1 f2 = new Fruit1("apple", 20);
		System.out.println(f1.equals(f2));
	}
}
