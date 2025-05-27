package org.Assignments3.String_Assignments;

public class FindNonRepeatedCharacter {

	public static void main(String[] args) {
		
	        String str = "swiss";
	        boolean found = false;

	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);
	            boolean isRepeated = false;
	            
            for (int j = 0; j < str.length(); j++) {
	                if (ch == str.charAt(j) && i != j) {
	                    isRepeated = true;
	                    break;
	                }
	            }

	            if (!isRepeated) {
	                System.out.println("First non-repeated character is= " + ch);
	                found = true;
	                break;
	            }
	        }

	        if (!found) {
	            System.out.println("No non-repeated character found= ");
	        }
	}

}
