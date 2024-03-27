package practice;

import java.util.Arrays;

public class TwoArraysEqualOrNot {
	
	public static void main(String[] args) {
		int a[]= {1,2,5,7};
		int b[]= {1,2,3,4};
		int c[]= {1,2,5,7};
		
		System.out.println(Arrays.equals(a, b));
		System.out.println(Arrays.equals(b, c));
		System.out.println(Arrays.equals(a, c));
		
	}

}
