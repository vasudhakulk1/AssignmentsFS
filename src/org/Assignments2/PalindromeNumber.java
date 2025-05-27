package org.Assignments2;

public class PalindromeNumber {

	public static void main(String[] args) {
		 int num = 13311;
	        int originalNum = num;
	        int reversedNum = 0;

	        for (int i = num; i > 0; i /= 10) {
	            int digit = i % 10;
	            reversedNum = reversedNum * 10 + digit;
	        }

	        if (originalNum == reversedNum)
	            System.out.println(num + " is a palindrome.");
	        else
	            System.out.println(num + " is not a palindrome.");
	    }

	}


