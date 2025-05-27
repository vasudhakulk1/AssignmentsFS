package org.Assignments3;

public class RemoveDuplicatesFromArray {

	public static void main(String[] args) {
		 int[] array = {34,65,43,34,65,10,20};

	        int n = array.length;

	        System.out.print("Original array= ");
	        for (int i = 0; i < n; i++) {
	            System.out.print(array[i] + " ");
	        }

	        int[] temp = new int[n];
	        int newLength = 0;

	        for (int i = 0; i < n; i++) {
	            boolean isDuplicate = false;
	            for (int j = 0; j < newLength; j++) {
	                if (array[i] == temp[j]) {
	                    isDuplicate = true;
	                    break;
	                }
	            }

	            if (!isDuplicate) {
	                temp[newLength] = array[i];
	                newLength++;
	            }
	        }

	        System.out.print("\nArray after removing duplicates= ");
	        for (int i = 0; i < newLength; i++) {
	            System.out.print(temp[i] + " ");
	        }
	    }
	}

