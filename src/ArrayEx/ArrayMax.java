package ArrayEx;

public class ArrayMax {
	public static void main(String[] args) {
	 int[] arr = {1, 5, 7, 8};
     int max = arr[0];
     for (int i = 1; i < arr.length; i++) {
         if (arr[i] > max) {
            max = arr[i];
         }
     }
     System.out.println("Maximum element is "+ max);
	}
}

