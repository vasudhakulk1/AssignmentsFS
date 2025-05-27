package org.Assignments3.Array_Assignments;

public class LargestElementFromArray {

	public static void main(String[] args) {
		 int[] numbers = {1,2,7,3,9,4,88,34,67};
	        int largest = numbers[0]; 

	        for (int i = 1; i < numbers.length; i++) {
	            if (numbers[i] > largest) {
	                largest = numbers[i]; 
	            }
	        }

	        System.out.println("The largest element in the array is= " + largest);
	    }

	}


