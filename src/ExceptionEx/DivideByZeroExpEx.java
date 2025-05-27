package ExceptionEx;

public class DivideByZeroExpEx {

	public static void main(String[] args) {
		int a=10;
		int b=0;
		
		try {
		int c= a/b;
		System.out.println("Result is= "+c);

	}
		catch( ArithmeticException ex){
		System.out.println("Error= "+ ex.getMessage());
		System.out.println("Can not divide a value by zero ");
	}
		
   }
}


