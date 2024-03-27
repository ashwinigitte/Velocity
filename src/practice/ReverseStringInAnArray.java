package practice;

public class ReverseStringInAnArray {
//ashwini govind munde => iniwhsa dnivog
	public static void main(String[] args) {
		String str = "ashwini govind munde";
		String ar[] = str.split(" ");
		String emp = "";

		for (int i = 0; i < ar.length; i++) {
			String s1 = ar[i] + " ";

			for (int j = s1.length() - 1; j >= 0; j--) {
				emp = emp + s1.charAt(j);

			}
		}
		System.out.print(emp);
	}

}

