package org.OOPs;

class Parent {
	String car = "Nexon"; 
	int parent_money = 50000; 
}

class Child extends Parent {
	String bike ="TVS Apache"; 
	int child_money =3000;
	
	public void total() {
		System.out.println("Total Assets:");
		System.out.println("Cars: " + car);
		System.out.println("Bikes: " + bike);
		System.out.println("Parent Money" + parent_money);
		System.out.println("Child Money" + child_money);
		//System.out.println("Total sum of Money: " + );
		int sum = parent_money + child_money;
		System.out.println("Total sum of money= "+sum);
	}
}

public class InheritanceTest {

	public static void main(String[] args) {
		Child child = new Child(); 
		child.total();
				
	}

}
