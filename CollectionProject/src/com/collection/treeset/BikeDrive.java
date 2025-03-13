package com.collection.treeset;

import java.util.TreeSet;


public class BikeDrive {
	public static void main(String[] args) {
		TreeSet<Bike> ts = new TreeSet<Bike>();
		ts.add(new Bike("ducati", 14.25));
		ts.add(new Bike("hayabusa", 10.40));
		ts.add(new Bike("triumph rocket 3", 15.90));
		ts.add(new Bike("zx10r",13.60));
		ts.add(new Bike("z900", 18.50));
		ts.add(new Bike("interceptor", 22.45));
		ts.add(new Bike("classic 350", 35.25));
		ts.add(new Bike("fz", 45.50));
		
		for(Bike b : ts) {
			System.out.println(b);
		}
	}
}
