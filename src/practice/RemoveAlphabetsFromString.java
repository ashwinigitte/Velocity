package practice;

public class RemoveAlphabetsFromString {
public static void main(String[] args) {
	String s ="a45dsgd132";
	String emp="";
	for(int i=0;i<s.length();i++) {
		if(Character.isDigit(s.charAt(i))) {
			emp = emp+s.charAt(i);
		}
	}System.out.println(emp);
}
	
}
