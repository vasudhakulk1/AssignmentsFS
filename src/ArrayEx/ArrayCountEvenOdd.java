package ArrayEx;

public class ArrayCountEvenOdd {

	public static void main(String[] args) {
		
		int[][] array = {{11, 62}, {73, 46}, {50, 88},{55,30}};
        int even = 0, odd = 0;

        for (int[] row : array) {
            for (int val : row) {
                if (val % 2 == 0) 
                	even++;
                else odd++;
            }
        }

        System.out.println("Even Values= " + even + " Odd Values= " + odd);
    }
}
