package practice;

public class RemoveUpperCaseChar {

	public static void main(String[] args) {
		String s = "agshg1233AHDJHSAJ@#$$%%^";
		s = s.replaceAll("[A-Z]","");
		System.out.println(s);
		}
}
