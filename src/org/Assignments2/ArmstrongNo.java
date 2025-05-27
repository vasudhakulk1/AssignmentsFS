package org.Assignments2;
import java.util.Scanner;

public class ArmstrongNo {

	public static void main(String[] args) {
		
		        Scanner scanner = new Scanner(System.in);
		        System.out.println("Enter a number:");
		        int num = scanner.nextInt();
		        int temp = num;
		        int sum = 0;
		        int n = String.valueOf(num).length();

		        while (temp!= 0) {
		            int rem = temp % 10;
		            sum += (int) Math.pow(rem, n);
		            temp /= 10;
		        }

		        if (sum == num) {
		            System.out.println(num + " is an Armstrong number.");
		        } else
		        {
		        	System.out.println(num + " is not an Armstrong number.");
		 		   
		        }
		        scanner.close();


	}

}
