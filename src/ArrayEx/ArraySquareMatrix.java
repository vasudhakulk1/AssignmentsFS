package ArrayEx;

public class ArraySquareMatrix {

	public static void main(String[] args) {
		 int[][] matrix = {
		            {1, 2, 3},
		            {4, 5, 6},
		            {7, 8, 9}
		        };

		        System.out.println("Main Diagonal:");
		        for (int i = 0; i < matrix.length; i++) {
		            System.out.print(matrix[i][i] + " ");
		        }

	}

}
