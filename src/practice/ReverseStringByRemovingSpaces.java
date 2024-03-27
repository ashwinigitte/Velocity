package practice;

public class ReverseStringByRemovingSpaces {

	public static void main(String[] args) {
		String s="ash win i";
		s = s.replace(" ", "");
		String emp="";
		for(int i=s.length()-1;i>=0;i--) {
			emp=emp+s.charAt(i);
		} 
		System.out.println(emp);
	}
}
