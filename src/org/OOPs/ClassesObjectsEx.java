package org.OOPs;

class Employee{
	
	String name;
	int id;
	
}

public class ClassesObjectsEx {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.id = 101;
		e1.name = "John";
		
		Employee e2 = new Employee();
		e2.id = 102;
		e2.name = "Kim";
		
		System.out.println(e1.id + " " + e1.name);
		System.out.println(e2.id + " " + e2.name);
		

	}

}
