package ArrayEx;

public class MatrixAddition {

	public static void main(String[] args) {
		 int[][] a = {{1, 2}, {3, 4}};
	        int[][] b = {{5, 6}, {7, 8}};
	        int[][] sum = new int[2][2];

	        for (int i = 0; i < 2; i++) {
	            for (int j = 0; j < 2; j++) {
	                sum[i][j] = a[i][j] + b[i][j];
	            }
	        }

	        System.out.println("Sum Matrix:");
	        for (int i = 0; i < sum.length; i++) {
	            for (int j = 0; j < sum[i].length; j++) {
	                System.out.print(sum[i][j] + " ");
	            }
	            System.out.println();
	        }

	}

}
