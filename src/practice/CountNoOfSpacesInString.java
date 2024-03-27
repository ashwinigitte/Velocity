package practice;

public class CountNoOfSpacesInString {
public static void main(String[] args) {
	String s = "as h w i n i";
	int count=0;
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)==' ') {
			count++;
		}
	}System.out.print(count);
}
}
