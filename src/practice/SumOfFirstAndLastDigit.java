package practice;

public class SumOfFirstAndLastDigit {

	public static void main(String[] args) {
		int num=12345;
		int n=num%10;
		int sum=0;
		while(num>9) {
			num=num/10;
		}
		sum=num+n;
		System.out.println(sum);
	}
}
