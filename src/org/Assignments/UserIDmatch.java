package org.Assignments;

import java.util.Scanner;

public class UserIDmatch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter User ID: ");
        String userId = scanner.nextLine();

        if (userId.equals("JK1122")) {
            System.out.println("Jake's name: Jake");
            System.out.println("Jake's age: 21");
        } else {
            System.out.println("Invalid User ID");
       

	}
 }
}
