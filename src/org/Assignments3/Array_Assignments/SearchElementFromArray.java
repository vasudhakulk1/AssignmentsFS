package org.Assignments3.Array_Assignments;
import java.util.Scanner;

public class SearchElementFromArray {

	public static void main(String[] args) {
		int[] numbers = {10,20,30,40,50}; 
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the element to search= ");
        int searchValue = scanner.nextInt();

        boolean found = false;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == searchValue) {
                System.out.println(searchValue + " found at index " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println(searchValue + " not found in the array.");
        }

        scanner.close();
    }

}
