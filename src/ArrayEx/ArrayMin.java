package ArrayEx;

public class ArrayMin {

	public static void main(String[] args) {
		int[] arr = {2, 5, 7, 8};
	     int min = arr[0];
	     for (int i = 1; i < arr.length; i++) {
	         if (arr[i] < min) {
	            min = arr[i];
	         }

	     }
	     System.out.println("Min value from array is "+min);
	}
}
