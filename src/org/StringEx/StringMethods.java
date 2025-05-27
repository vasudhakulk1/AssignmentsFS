package org.StringEx;

import java.util.Scanner;

public class StringMethods {

	public static void main(String[] args) {

		String str1 = "Hello World";
		String str2 = "hello world";
	    String str3= "Welcome to Java Program";
	    System.out.println("Comparing strings str1 with str2= "+str1.equals(str2)); 
	    System.out.println("Comparing strings str1 with str2 ignoring case sensitivity= "+str1.equalsIgnoreCase(str2));
	    System.out.println("Comparing strings if same or not= "+str1.equals(str3));
		
		System.out.println("Combining using Concat method Example= "+str1.concat(str3));
        

		System.out.println("starts method implementation=  "+str1.startsWith(" ggg")); 
		System.out.println("endsWith method implementation=  "+str2.endsWith(" World"));
       
        System.out.println("checks if string is present or not= "+str1.contains("Hel"));   
        System.out.println("checks if string is present or not= "+str2.contains("e"));     
        System.out.println("checks if string is present or not= "+str3.contains("Hi")); 
        
        
    }


}


