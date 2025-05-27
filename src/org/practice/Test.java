package org.practice;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int n;

        do {
            System.out.print("Enter a number: ");
            n = scanner.nextInt();
            System.out.println("You entered: " + n);
        } while (n != 0);

        System.out.println("Exit");
        scanner.close();


	}

	/*int n;

    do{
        System.out.println("Enter no. 0 to end prgrm ");
        n=sc.nextInt();
    }
    while(n !=0);
    {
        System.out.println("End the loop");
    }
kmj-kojj-nxt
	*/
}
