package org.Assignments3;

public class MergeTwoArrays {

	public static void main(String[] args) {
		 int[] array1 = {1,2,3,4};
	        int[] array2 = {5,6,7,8};

	        int[] mergedArray = new int[array1.length + array2.length];

	        for (int i = 0; i < array1.length; i++) {
	            mergedArray[i] = array1[i];
	        }

	        for (int i = 0; i < array2.length; i++) {
	            mergedArray[array1.length + i] = array2[i];
	        }

	        System.out.print("Merged Array from given array is= ");
	        for (int i = 0; i < mergedArray.length; i++) {
	            System.out.print(mergedArray[i] + " ");
	        }
	    }

	}

