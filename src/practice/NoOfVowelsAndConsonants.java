package practice;

public class NoOfVowelsAndConsonants {
public static void main(String[] args) {
	String s = "ashwini";
	int Vcount=0;
	int Ccount=0;
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
			Vcount++;
		}else if(s.charAt(i)>'a' && s.charAt(i)<='z') {
			Ccount++;
		}
		
	}System.out.println("number of Vovels are: "+Vcount);
	System.out.println("number of Consonants are: "+Ccount);
}
}
