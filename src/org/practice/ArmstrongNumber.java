package org.practice;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int number = 153;
		int result =0;
		int temp = number;
		int reminder= 0;
		while (temp !=0) {
			reminder =temp%10;
			System.out.println(reminder);
			result = (int)(result + Math.pow(reminder, 3));
			temp = temp/10;
			
		}

	}

}
