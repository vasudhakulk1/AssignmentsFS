package org.Assignments3.String_Assignments;

public class CompareTwoStrings {

	public static void main(String[] args) {
		String str1 = "Hello";
        String str2 = "hello";

        if (str1.equals(str2)) {
            System.out.println("Strings are equal.");
        } else {
            System.out.println("Strings are not equal.");
        }
		  if (str1.equalsIgnoreCase(str2)) {
		  System.out.println("Strings are equal (ignoring case)."); 
		  } 
		  else {
		  System.out.println("Strings are not equal (ignoring case)."); 
		  }
		 
    }

}


