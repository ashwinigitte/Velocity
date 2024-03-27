package practice;

import java.util.Scanner;

public class GivenNumberPrimeOrNot {

	public static void main(String[] args) {
		System.out.println("enter any number:");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int count=0;
		if(input==0|input==1) {
			System.out.println(input+" is neither prime nor composite");
		}
		for(int i=1;i<=input;i++) {
			
			if(input%i==0) {
				count++;
			}
			if(count==2) {
				System.out.println(input+" is a prime number");
			}
		}
		
	}
}
