package ArrayEx;

public class ArrayDuplicates {

	public static void main(String[] args) {
		 int[] numbers = {35,20,74,200,20,35,1,200,7};

	        System.out.println("Duplicate values in the array=");

	        for (int i = 0; i < numbers.length; i++) {
	            for (int j = i + 1; j < numbers.length; j++) {
	                if (numbers[i] == numbers[j]) {
	                    System.out.println(numbers[i]);
	                    break;
	                }
	            }
	        }
	    }

	}


