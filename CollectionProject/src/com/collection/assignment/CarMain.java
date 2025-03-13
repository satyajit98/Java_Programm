package com.collection.assignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CarMain {

		
		public static void printModelBetween2020to2024(List<Car> list) {
			System.out.println("-----------------");
			System.out.println("--- print model between 2020 to 2024 ---");
			System.out.println("-----------------");
			for(int i = 0; i<list.size(); i++) {
				if(list.get(i).getModel() >= 2020 && list.get(i).getModel() <= 2024) {
					System.out.println(list.get(i));
				}
			}
		}
		
		public static void printColorBlack(List<Car> list) {
			System.out.println("-----------------");
			System.out.println("--- Print color black ---");
			System.out.println("-----------------");
			Iterator<Car> i = list.iterator();
			while(i.hasNext()) {
				Car car = i.next();
//				System.out.println(car);
				if(car.getColor().equalsIgnoreCase("bLack")) {
					System.out.println(car);
				}
			}
		}
		
		public static void printPriceBetween5to10Lakh(List<Car> list) {
			System.out.println("-----------------");
			System.out.println("--- Print price between 5 to 10 lakh ---");
			System.out.println("-----------------");
			for(Car c: list) {
				if(c.getPrice() >= 500000 && c.getPrice() <= 1000000) {
					System.out.println(c);
				}
			}
		}
		
		public static void printBrandToyota(List<Car> list) {
			System.out.println("-----------------");
			System.out.println("--- Print Brand Toyota---");
			System.out.println("-----------------");
			
			Iterator<Car> i = list.iterator();
			while(i.hasNext()) {
				Car car = i.next();
				if(car.getBrand().equalsIgnoreCase("toYota")) {
					System.out.println(car);
				}
			}
		}
		
		public static void main(String[] args) {
			List<Car> al = new ArrayList<Car>();
			al.add(new Car(2019,"black", 500000D, "toyota"));
			al.add(new Car(2021, "white", 250000D, "nano"));
			al.add(new Car(2023, "blue", 780000D, "skoda"));
			al.add(new Car(2020, "mateblack", 850000D,"defender"));
			al.add(new Car(2018, "grey", 1400000D, "toyota"));
			printModelBetween2020to2024(al);
			printColorBlack(al);
			printPriceBetween5to10Lakh(al);
			printBrandToyota(al);
		}
}
