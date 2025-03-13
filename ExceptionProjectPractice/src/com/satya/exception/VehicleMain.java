package com.satya.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

class LowSpeedException extends Exception{
	LowSpeedException(String message){
		super(message);
	}
}

class AverageSpeedException extends Exception{
	AverageSpeedException(String message){
		super(message);
	}
}

class HighSpeedException extends Exception{
	HighSpeedException(String message){
		super(message);
	}
}

class Vehicle
{
	private double speed;
	
	public Vehicle(double speed) {
		this.speed = speed;
	}
	
	public double getSpeed()
	{
		return speed;
	}
	
	public void checkSpeed() throws LowSpeedException, AverageSpeedException, HighSpeedException
	{
		if(speed <= 40) {
			throw new LowSpeedException("Very low Speed");
		}
		else if(speed >= 40 && speed <= 60) {
			throw new AverageSpeedException("Average Speed");
		}
		else
			throw new HighSpeedException("High Speed");
	}
}

public class VehicleMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the speed: ");
		try {
			double speed = sc.nextDouble();
			Vehicle v = new Vehicle(speed);
			try {
				v.checkSpeed();
			}
			catch(LowSpeedException e) {
				System.out.println("Speed is: "+v.getSpeed()+ " Car is: "+e.getMessage()+" speed");
			}
			catch(AverageSpeedException e) {
				System.out.println("Speed is: "+v.getSpeed()+" Car is: "+e.getMessage()+ " speed");
			}
			catch(HighSpeedException e) {
				System.out.println("Speed is: "+v.getSpeed()+" Car is: "+e.getMessage()+ " speed");
			}
		}
		catch(InputMismatchException e) {
			System.out.println("Invalid input");
		}
		sc.close();
	}
}
