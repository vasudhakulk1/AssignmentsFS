package org.StringEx;

public class StringBuilderAndStringBuffer {

	public static void main(String[] args) {
		StringBuilder stringBuilder = new StringBuilder("Java ");
        stringBuilder.append("Programming");
        
        stringBuilder.replace(6, 11, "Java");
        System.out.println("StringBuilder: " + stringBuilder); 

        StringBuffer stringBuffer = new StringBuffer("Hello");
        stringBuffer.append(" World");
        System.out.println("StringBuffer: " + stringBuffer); 
        
        


	}

}
