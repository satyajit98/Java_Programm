package com.collection.treeset;

public class Bike implements Comparable<Bike> {
	private String bikeName;
	private double milage;
	
	Bike(String bikeName, double milage){
		this.bikeName = bikeName;
		this.milage = milage;
	}
	
	public String getColor() {
		return bikeName;
	}
	public void setColor(String bikeName) {
		this.bikeName = bikeName;
	}
	
	public double getMilage() {
		return milage;
	}
	public void setMilage(double milage) {
		this.milage = milage;
	}
	
	@Override
	public String toString() {
		return "Bike[Bike Name:"+ bikeName + "Price is: "+ milage +"]";
	}
@Override
	public int compareTo(Bike o) {
		
		return (int)(this.milage - o.milage);
	}
}
