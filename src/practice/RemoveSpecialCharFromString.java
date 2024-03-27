package practice;

public class RemoveSpecialCharFromString {

	public static void main(String[] args) {
		String s = "aghSKJDJHSJ254256@$*&";
		s = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
	}
}
