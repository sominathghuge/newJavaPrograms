package javaConcepts;

import java.util.Arrays;

public class EqualityOperator {
	
	public static void main(String[] args) {
		
		String s1="Hello";
		String s2="Hello";
		String s3= new String("Hello");
		
		System.out.println(s1==s2);       //Created objects are same
	    System.out.println(s1==s3);       //Created objects are same
		System.out.println(s2==s3);       //Created objects are NOT same
		System.out.println(s1.equals(s2)); //Objects value is same
		System.out.println(s2.equals(s3)); //Objects value is same
		System.out.println(s1.equals(s3)); //Objects value is NOT same
        
		
		int a[]= {12,34};
		int b[]= {12,34};
		
		System.out.println(Arrays.equals(a, b)); //Compares objects value
		
	
	}

}
