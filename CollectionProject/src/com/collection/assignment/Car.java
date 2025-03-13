package com.collection.assignment;

//assignment: WAP to store only car obejct (Generic) in arraylist and perform the below following opertaion
//	1. print the car details whose model in between 2020 - 2024
//	2. print the car details whose color is black
//	3. print the car details whose price is in between 5 - 10 lakh
//	4. print the car details whose brand is toyota
//	   make car as encapsulated class.

class Car{
	private int model;
	private String color;
	private double price;
	private String brand;
	
	public Car(int model, String color, double price, String brand) {
		super();
		this.model = model;
		this.color = color;
		this.price = price;
		this.brand = brand;
	}

	public int getModel() {
		return model;
	}

	public void setModel(int model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	
	@Override
	public String toString() {
		return "Car [model=" + model + ", color=" + color + ", price=" + price + ", brand=" + brand + "]";
	}
}

