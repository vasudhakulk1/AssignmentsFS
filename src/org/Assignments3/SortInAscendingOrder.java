package org.Assignments3;

public class SortInAscendingOrder {

	public static void main(String[] args) {
		int[] numbers = {45,72,89,4,32}; 

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    // Swap elements
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }

        System.out.print("Sorted array in ascending order= ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }

	}


