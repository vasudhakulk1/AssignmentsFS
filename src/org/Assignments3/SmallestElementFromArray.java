package org.Assignments3;

public class SmallestElementFromArray {

	public static void main(String[] args) {
		 int[] numbers = {65,2,7,56,45,30,14}; 
	        int smallest = numbers[0]; 
	        for (int i = 1; i < numbers.length; i++) {
	            if (numbers[i] < smallest) {
	                smallest = numbers[i];
	            }
	        }

	        System.out.println("The smallest element in the array is: " + smallest);
	    }

	}


