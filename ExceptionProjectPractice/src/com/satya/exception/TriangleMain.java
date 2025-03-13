package com.satya.exception;

import java.util.InputMismatchException;
import java.util.Scanner;


class EquilateralException extends Exception{
	public EquilateralException(String message) {
		super(message);
	}
}

class IsocelessException extends Exception{
	public IsocelessException(String message) {
		super(message);
	}
}

class ScaleneException extends Exception{
	public ScaleneException(String message) {
		super(message);
	}
}

class Triangle{
	private double side1;
	private double side2;
	private double side3;
	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	public double getSide1() {
		return side1;
	}
	public double getSide2() {
		return side2;
	}
	public double getSide3() {
		return side3;
	}
	
	public void checkTriangle() throws EquilateralException, IsocelessException, ScaleneException
	{
		if(side1 == side2 && side2 == side3 && side3 == side1) {
			throw new EquilateralException("This is Equilateral");
		}
		else if(side1 == side2 || side2 == side3 || side3 == side1) {
			throw new IsocelessException("This is Isoceless");
		}
		else if(side1 != side2 && side2 != side3 && side3 != side1) {
			throw new ScaleneException("This is Scalene");
		}
	}
}

public class TriangleMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Side1: ");
		try {
			double side1 = sc.nextDouble();
			System.out.println("Enter the Side2: ");
			double side2 = sc.nextDouble();
			System.out.println("Enter the Side3: ");
			double side3 = sc.nextDouble();
			Triangle t = new Triangle(side1, side2, side3);
			try {
				t.checkTriangle();
			}
			catch(EquilateralException e) {
				System.out.println("Side1: "+t.getSide1()+", Side2: "+t.getSide2()+", Side3: "+t.getSide3()+", and "+ e.getMessage());
			}
			catch(IsocelessException e) {
				System.out.println("Side1: "+t.getSide1()+", Side2: "+t.getSide2()+", Side3: "+t.getSide3()+", and "+ e.getMessage());
			}
			catch(ScaleneException e) {
				System.out.println("Side1: "+t.getSide1()+", Side2: "+t.getSide2()+", Side3: "+t.getSide3()+", and "+ e.getMessage());
			}
		}
		catch(InputMismatchException e) {
			System.out.println("Invalid Input");
		}
		sc.close();

	}

}