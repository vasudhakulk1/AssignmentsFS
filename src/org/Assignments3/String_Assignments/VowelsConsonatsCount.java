package org.Assignments3.String_Assignments;

import java.util.Scanner;

public class VowelsConsonatsCount {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string= ");
        String str = scanner.nextLine();
        str = str.toLowerCase();

        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Number of vowels= " + vowels);
        System.out.println("Number of consonants= " + consonants);

        scanner.close();
    }

}


