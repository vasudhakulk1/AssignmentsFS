package org.Assignments3;

public class ArmstrongNoFromOneToThousand {

	public static void main(String[] args) {
		for (int num = 1; num <= 1000; num++) {
            int sum = 0;
            int n = num;
            int m = String.valueOf(num).length();
            while (n > 0) {
                int digit = n % 10;
                sum += Math.pow(digit, m);
                n /= 10;
            }
            if (num == sum) {
                System.out.println(num);
            }
        }
    }
}


