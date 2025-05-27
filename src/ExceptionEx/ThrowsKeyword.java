package ExceptionEx;

public class ThrowsKeyword {

	public static void main(String[] args) {
		//2.Checked Custom Exception (extends Exception)

		class InvalidAgeException extends Exception {
		    public InvalidAgeException(String message) {
		        super(message);
		    }
		}
		/*public class CustomExceptionChecked {
		    public static void checkAdmissionAge(int age) throws InvalidAgeException,ArithmeticException {
		        if (age < 17) {
		            throw new InvalidAgeException("Age must be 17 or above for admission");
		        } else {
		            System.out.println("Admission allowed");
		

	}
*/
}
}
	
