package org.Assignments3.String_Assignments;

public class ReplaceChar {

	public static void main(String[] args) {
		 String str = "run";
	        char oldChar = 'r';
	        char newChar = 'g';
	        String result = "";

	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);

	            if (ch == oldChar) {
	                result += newChar;
	            } else {
	                result += ch;
	            }
	        }
	        System.out.println("Original String= " + str);
	        System.out.println("Modified String= " + result);
	    }

}


