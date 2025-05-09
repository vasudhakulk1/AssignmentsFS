package org.Assignments;

import java.util.Scanner;

public class FahrenheitToCelsis {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = sc.nextDouble();

        double celsius = (fahrenheit - 32) * 5.0 / 9.0;

        System.out.println("Temperature in Celsius: " + celsius);

        sc.close();
	}

}
