package practice;

public class KeepOnlySpecialChar {

	public static void main(String[] args) {
		String s = "ahdjdhjHDHJS@##%%^";
		s = s.replaceAll("[a-zA-Z0-9]", "");
		System.out.println(s);
	}
}
