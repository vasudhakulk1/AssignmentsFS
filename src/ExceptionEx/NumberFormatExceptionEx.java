package ExceptionEx;

import java.util.Scanner;

public class NumberFormatExceptionEx {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number=  ");
        String str = scanner.nextLine();

        try {
            int number = Integer.parseInt(str);
            System.out.println("Converted integer= " + number);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException occured,Please enter a valid integer.");
        }

        scanner.close();
    }

	}


