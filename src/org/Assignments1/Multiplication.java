package org.Assignments1;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();

        int multiplication = a * b;
        System.out.println("The product is: " + multiplication);

        scanner.close();
	}

}
