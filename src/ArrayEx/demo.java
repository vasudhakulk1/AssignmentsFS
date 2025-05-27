package ArrayEx;

public class demo {
	static int []arr= {20,60,85,41};
	public static void main(String[] args) {
		
		  demo obj = new demo(); 
		  System.out.println("Calling reverse method");
		  obj.reverse();
		  System.out.println(" ");
		  System.out.println("Calling sum method");
		  obj.sum();
		  System.out.println("Calling max method");
		  obj.max();
		  System.out.println("calling min method");
		  obj.min();
		  System.out.println("Calling EvenOdd");
		  obj.countEvenOdd();
	}
		//max of array
		public void max() {
		 //int [] arr= {1,2,3,4}; 
		 int max = arr[0];
		 for (int i = 1; i<arr.length; i++) {
			if ( arr[i]>max) {
				max = arr[i];
			}
		}System.out.println("Max ele is: " +max);
	}		
		//sum array
		public void sum() {
		  //int [] arr= {1,2,3,4}; 
		  int sum = arr[0]; 
		  for (int i=1; i<arr.length; i++) {
		  sum = sum+arr[i]; 
		  } 
		  System.out.println("Sum is "+sum);
		}
		//reverse 
		public void reverse() {
		
		System.out.println("Reverse array is= ");
		for(int i=arr.length-1; i>=0; i--) {
			System.out.print(" "+arr[i]);
		
		}
	}
		public void min() {
			 int small = arr[0];
			 for (int i = 1; i<arr.length; i++) {
				if ( arr[i]<small) {
					small = arr[i];
				}
		}System.out.println("Smallest ele is "+small);
}
		public void countEvenOdd() {
			int countEven=0,countOdd=0;
			for (int i=0; i<=arr.length; i++ ) {
				if (i%2==0) {
					countEven++;
				}
				else {
					countOdd++;
				}
			}
			System.out.println("Count of Even "+countEven);
			System.out.println("Count of Odd "+countOdd);
		
		}
}	
