package org.Assignments2;

public class ReverseNumber {

	public static void main(String[] args) {
		int num=1234 ;
        int rev=0;

        for(;num!=0; num/=10){
        int temp= num%10;
        rev= rev *10+temp;
        }
        System.out.println("Reversed Number is :" +rev);
    }

	}


