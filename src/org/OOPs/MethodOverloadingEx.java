package org.OOPs;

public class MethodOverloadingEx {

	public static void main(String[] args) {
	Calc cal = new Calc();
	cal.add(10, (double) 5.8);
		}

}
class Calc{
	public void add(int a, double b) {
		double c=(int) (a + b);
		System.out.println("Sum ="+c);	

		
	}
}
