package org.Assignments;
import java.util.Scanner;

public class IncrementAge {

	public static void main(String[] args) {
		
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter your age: ");
	        int age = scanner.nextInt();
	        scanner.close();
	        int newAge = age + 1;
	        System.out.println("New age after increment: " + newAge);
	    }

	}


