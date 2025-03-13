package com.collection.hashset;

import java.util.Objects;

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
	public int hashCode() {
		return Objects.hash(brand, color, model, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		return Objects.equals(brand, other.brand) && Objects.equals(color, other.color) && model == other.model
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", color=" + color + ", price=" + price + ", brand=" + brand + "]";
	}
}









