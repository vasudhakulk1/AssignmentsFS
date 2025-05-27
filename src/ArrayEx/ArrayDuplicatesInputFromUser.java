package ArrayEx;

import java.util.Scanner;

public class ArrayDuplicatesInputFromUser {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        
	        System.out.print("Enter the size of the array: ");
	        int size = scanner.nextInt();

	        int[] numbers = new int[size];

	        System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < size; i++) {
	            numbers[i] = scanner.nextInt();
	        }

	        System.out.println("Duplicate elements in the array:");

	        for (int i = 0; i < numbers.length; i++) {
	            for (int j = i + 1; j < numbers.length; j++) {
	                if (numbers[i] == numbers[j]) {
	                    System.out.println(numbers[i]);
	                    break; 
	                    }
	            }
	        }
	        
	        scanner.close();
	}


}
