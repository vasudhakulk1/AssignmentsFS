package ArrayEx;

public class ArrayTwoDInitializeAndPrinting {

	public static void main(String[] args) {
		int[][] array = {
	            {20, 90},
	            {76, 54}
	        };

	        for (int i = 0; i < array.length; i++) {
	            for (int j = 0; j < array[i].length; j++) {
	                System.out.print(array[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }

	}


