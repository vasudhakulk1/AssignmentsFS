package org.Assignments3.String_Assignments;

public class CountFrequencyOfCharacters {

	public static void main(String[] args) {
		String str = "HelloWorld";
        int[] freq = new int[256]; 

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch]++;
        }

        System.out.println("Character frequencies:");
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                System.out.println((char)i + " = " + freq[i]);
            }
        }

	}

}
