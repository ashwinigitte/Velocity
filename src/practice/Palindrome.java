package practice;

public class Palindrome {
public static void main(String[] args) {
	String str = "madam";
	String emp = "";
	for(int i=str.length()-1;i>=0;i--) {
		emp=emp+str.charAt(i);
	}
	if(emp.equals(str)) {
		System.out.println("two strings are palindromes!!");
	}else {
		System.out.println("two strings are not palindromes!!");
	}
}
}
