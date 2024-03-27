package practice;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		int numberToCheck = 371;
		int temp = numberToCheck;
		int remainder = 0;
		int result =0;
		
		while(temp != 0) {
			remainder = temp%10;
			result = result + (remainder*remainder*remainder);
			temp=temp/10;
			
		}if(result==numberToCheck) {
			System.out.println(numberToCheck + " is a armstrong number");
		}else {
			System.out.println(numberToCheck + " is not a armstrong number");
		}
	}
}
