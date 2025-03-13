package com.collection.hashset;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;


public class CarDrive {
	// remove the duplicate
	public static void removeDuplicate(HashSet<Car> hs) {

		for(Car c: hs) {
			System.out.println(c);
		}
	}
	
	//sort in ascending order
	public static void sortInAscendingOrder(HashSet<Car> hs) {
		LinkedList<Car> li = new LinkedList<>(hs);
		
		Collections.sort(li, new SortBasedOnPrice());
		
		System.out.println("---------------");
		for(Car c: li) {
			System.out.println(c);
		}
	}
	
	public static void main(String[] args) {
		HashSet<Car> hs = new HashSet<>();
		hs.add(new Car(2019,"black", 500000D, "toyota"));
		hs.add(new Car(2021, "white", 250000D, "nano"));
		hs.add(new Car(2023, "blue", 780000D, "skoda"));
		hs.add(new Car(2020, "mateblack", 850000D,"defender"));
		hs.add(new Car(2018, "grey", 1400000D, "toyota"));
		hs.add(new Car(2021, "white", 250000D, "nano"));
		hs.add(new Car(2023, "blue", 780000D, "skoda"));
		hs.add(new Car(2020, "mateblack", 850000D,"defender"));
		
		removeDuplicate(hs);
		sortInAscendingOrder(hs);
	}
}
