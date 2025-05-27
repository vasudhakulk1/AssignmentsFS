package org.OOPs;


abstract class Father{
	abstract void display();
}
class Son extends Father{
	void display() {
		System.out.println("Abstract method implemented");
	}
}

public class AbstractEx {

	public static void main(String[] args) {
		Son obj1 = new Son();
		obj1.display();
		
	}

}
