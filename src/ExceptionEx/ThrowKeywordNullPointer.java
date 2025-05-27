package ExceptionEx;

public class ThrowKeywordNullPointer {

	public static void main(String[] args) {
		try {
            String str = null;
            if (str == null) {
                throw new NullPointerException("String is null");
            }
            //System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException occured");
        	
        }
	}

}
