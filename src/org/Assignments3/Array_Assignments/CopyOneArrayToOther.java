package org.Assignments3.Array_Assignments;

public class CopyOneArrayToOther {

	public static void main(String[] args) {
		int[] original = {34,54,3,89,22,11}; 
        int[] copy = new int[original.length]; 

        for (int i = 0; i < original.length; i++) {
            copy[i] = original[i];
        }

        System.out.print("Copied array: ");
        for (int i = 0; i < copy.length; i++) {
            System.out.print(copy[i] + " ");
        }
    }

	}


