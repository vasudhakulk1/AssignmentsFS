package ArrayEx;

public class ArrayBreakCont {

	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5};
		for (int number : numbers) {
		    if (number == 4) {
		        break; 
		    }
		    System.out.println(number);
		 }
	}
}


	


