package ExceptionEx;

public class MultipleCatchBlockEx {

	public static void main(String[] args) {
		try {
            int[] numbers = {10,20,30};
            int result = numbers[1] / 0;
            System.out.println(numbers[5]);
            
            
		 } catch (ArithmeticException e) {
	            System.out.println("can not divide by zero, ArithmeticException occured ");
	            
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Can not print array index, ArrayIndexOutOfBoundsException occured");

	}
  }
}
