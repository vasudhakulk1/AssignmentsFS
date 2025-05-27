package org.Assignments2;

public class FactorialNo {

	public static void main(String[] args) {
		 int num = 5;
	        int fact = 1; 
	        System.out.println("The given number is: " + num);
	       
	        for(int i = num; i >= 2; i--) {
	            fact = fact * i;
	        }
	       
	        System.out.println("The factorial of " + num + " is: " + fact);
	    }
	}


