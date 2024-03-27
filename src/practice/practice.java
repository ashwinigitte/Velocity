package practice;

import java.util.Arrays;

public class practice {
	public static void main(String[] args) {
String emp="";
		String s= "ashwini gitte";//iniwhsa ettig
		String ar[] = s.split("\\s");
		for(int i=0;i<ar.length;i++) {
			String s1 = ar[i]+" ";
			System.out.println(s1);
			for(int j=s1.length()-1;j>=0;j--) {
				emp = emp + s1.charAt(j);
			}
			
		}System.out.print(emp +" ");
		
		
	}
	
}

