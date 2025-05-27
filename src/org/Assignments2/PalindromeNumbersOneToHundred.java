package org.Assignments2;

public class PalindromeNumbersOneToHundred {

	public static void main(String[] args) {
		System.out.println("Palindrome numbers from 1 to 100= ");

        for (int i = 1; i <= 100; i++) {
            int num = i;
            int reversed = 0;

            while (num > 0) {
                int digit = num % 10;
                reversed = reversed * 10 + digit;
                num = num / 10;
            }

            if (i == reversed) {
                System.out.print(i + " ");
            }
        }

	}

}
