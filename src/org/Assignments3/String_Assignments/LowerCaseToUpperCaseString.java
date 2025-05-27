package org.Assignments3.String_Assignments;

public class LowerCaseToUpperCaseString {

	public static void main(String[] args) {
		String str = "Hello World";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
    
            if (ch >= 'a' && ch <= 'z') {
        
                ch = (char)(ch - 32);
            }

            result += ch; 
        }

        System.out.println("Original String: " + str);
        System.out.println("Uppercase String: " + result);
    }

}


