package org.OOPs;

public class SuperThisKeywordEx {
	
	class Parent{
		int car=2;
		
		
	}
	class Son extends Parent{
		int car=1;
		void show() {
		System.out.println("This keyword"+this.car);
		System.out.println("Super keyword"+super.car);
		}
		
	}

	public static void main(String[] args) {
		//Son s = new Son();
		
		//s.show();
	}

}
