package practice;

public class SumOfDigitsInString {
public static void main(String[] args) {
	

	String s = "gshgh4252bhsjh@$%^";
	int count = 0;
	for(int i=0;i<s.length();i++) {
		if(Character.isDigit(s.charAt(i))) {
			count=count+Integer.parseInt(s.charAt(i)+"");
		}
		
		
	}System.out.println(count);

}}
