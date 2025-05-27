package ExceptionEx;

public class NullPointerExpEx {

	public static void main(String[] args) {
		try {
			String str = null;
			System.out.println(str.length());
		}catch(NullPointerException e) {
			System.out.println("can not access null objects");
		}

	}

}
