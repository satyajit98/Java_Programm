package com.satya.exception;

public class ArrayIndexOutOfBoundException {
	public static void main(String[] args) {
		System.out.println("main start()");
		int arr[]= {15,23,8};
		try {
			System.out.println(arr[0]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index Out Of Bounds Exception occured");
		}
	}
}
