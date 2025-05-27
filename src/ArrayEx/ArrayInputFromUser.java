package ArrayEx;

import java.util.Scanner;

public class ArrayInputFromUser {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Give row size");
        int row=sc.nextInt();

        System.out.println("Give col size");
        int col=sc.nextInt();

        int arr[][]=new int[row][col];

        System.out.println("Enter i/p for arr elm");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<=arr.length;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        System.out.println("Print i/p for arr elm");
        for(int i=0;i<arr.length;i++){

        	for(int j=0;j<=arr.length;j++){
                arr[i][j]=sc.nextInt();
            }
	}

	}
}
