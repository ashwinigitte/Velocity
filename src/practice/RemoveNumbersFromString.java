package practice;

public class RemoveNumbersFromString {
public static void main(String[] args) {
	String s = "ah5h6ajd5267277";
	String emp="";
	for(int i=0;i<s.length();i++) {
		if(!Character.isDigit(s.charAt(i))) {
			emp=emp+s.charAt(i);
		}
		
	}System.out.println(emp);
}
}
