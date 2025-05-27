package org.Assignments1;

import java.util.Scanner;

public class AdditionUsingUserInput {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the first number: ");
	        int a = scanner.nextInt();

	        System.out.print("Enter the second number: ");
	        int b = scanner.nextInt();
	        int add = a + b;

	        System.out.println("The sum of " + a + " and " + b + " is: " + add);
	        scanner.close();
	}

}
