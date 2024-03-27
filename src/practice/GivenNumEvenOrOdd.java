package practice;

import java.util.Scanner;

public class GivenNumEvenOrOdd {
public static void main(String[] args) {
	System.out.println("enter any number");
	Scanner sc = new Scanner(System.in);
	int input = sc.nextInt();
	if(input%2==0) {
		System.out.println("GIVEN NUMBER IS EVEN NUMBER");
	}else {
		System.out.println("given number is odd number");
	}
}
}
