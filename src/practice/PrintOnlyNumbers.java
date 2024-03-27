package practice;

public class PrintOnlyNumbers {
public static void main(String[] args) {
	String s = "gssgh@dhhDJH154251@#$%";
	s = s.replaceAll("[^a-zA-Z0-9]", "");
	s = s.replaceAll("[^0-9]","" );
	System.out.println(s);
}
}
