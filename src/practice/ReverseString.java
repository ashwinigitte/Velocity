package practice;

public class ReverseString {
	
	public static void main(String[] args) {
		String s = "Ashwini";
		String emp = "";
		for(int i=s.length()-1;i>=0;i--) {
			emp = emp+s.charAt(i);
		
		}	System.out.println(emp);
		
	}

}
