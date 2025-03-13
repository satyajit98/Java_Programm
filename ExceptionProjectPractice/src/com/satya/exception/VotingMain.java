package com.satya.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

class EligibleExceptionforVote extends Exception{
	public EligibleExceptionforVote(String message) {
		super(message);
	}
}

class NotEligibleExceptionforVote extends Exception{
	public NotEligibleExceptionforVote(String message) {
		super(message);
	}
}

class Voting
{
	private int age;
	
	Voting(int age){
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public void checkEligibility() throws EligibleExceptionforVote, NotEligibleExceptionforVote
	{
		if(this.age >= 18) {
			throw new EligibleExceptionforVote("Eligible for voting");
		}else {
			throw new NotEligibleExceptionforVote("Not eligible for voting");
		}
	}
}
public class VotingMain {

	public static void main(String[] args) {
		System.out.println("Enter your age: ");
		Scanner sc = new Scanner(System.in);
		try {
			int age = sc.nextInt();			
			Voting v = new Voting(age);
			try
			{
				v.checkEligibility();
			}
			catch(EligibleExceptionforVote e) {
				System.out.println("Person age is: "+ v.getAge() + " he is "+e.getMessage());
			}
			catch(NotEligibleExceptionforVote e) {
				System.out.println("Person age is: "+ v.getAge() +" he is "+ e.getMessage());
			}
			
		}catch(InputMismatchException e){
			System.out.println("Invalid Number");
		}
		sc.close();
	}
}
