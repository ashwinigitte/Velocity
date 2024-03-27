package practice;

public class ThisIsStringReverse {
	public static void main(String[] args) {
		String s = "This is String";
		String ar[] = s.split("\\s");
		for(int i=ar.length-1;i>=0;i--) {
			System.out.print(ar[i]+" ");
		}
	}

}
