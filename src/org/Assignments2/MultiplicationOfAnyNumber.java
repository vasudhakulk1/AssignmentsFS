package org.Assignments2;

import java.util.Scanner;

public class MultiplicationOfAnyNumber {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();
	        
	        System.out.println("Multiplication table for " + number + ":");
	        for (int i = 1; i <= 10; i++) {
	            System.out.println(number + " * " + i + " = " + (number * i));
	        }
	        scanner.close();

	}

}
