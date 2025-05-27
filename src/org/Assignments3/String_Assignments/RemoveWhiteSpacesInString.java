package org.Assignments3.String_Assignments;

public class RemoveWhiteSpacesInString {

	public static void main(String[] args) {
		String str = "Hello World Welcome To Java Programming";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch != ' ') {
                result += ch;
            }
        }

        System.out.println("Original String: " + str);
        System.out.println("String without spaces: " + result);
    }
}


