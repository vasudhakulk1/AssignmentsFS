package org.Assignments;

import java.util.Scanner;

public class Name_and_Age {

	public static void main(String[] args) {
		String name;
		int age;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your Name: ");
		name=sc.nextLine();
		System.out.println("Enter your Age");
		age=sc.nextInt();
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);

		sc.close();
		
		
	}

}
