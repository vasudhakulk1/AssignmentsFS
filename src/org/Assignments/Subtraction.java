package org.Assignments;

import java.util.Scanner;

public class Subtraction {

	public static void main(String[] args) {
		 System.out.print("Enter the first number: ");
		 Scanner scanner = new Scanner(System.in);
	        int a = scanner.nextInt();

	        System.out.print("Enter the second number: ");
	        int b = scanner.nextInt();

	        int sub = a - b;
	        System.out.println("The subtraction is: " + sub);

	        scanner.close();

	}

}
