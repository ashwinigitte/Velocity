package practice;

import java.util.Arrays;

public class Anagrams {
	public static void main(String[] args) {
		
	
	
	  String s1="care";
      String s2="race";
      
      
      
      if(s1.length()==s2.length()){
      char c1[]=s1.toCharArray();
      char c2[]=s2.toCharArray();
      
          Arrays.sort(c1);
          Arrays.sort(c2);
          
          if(Arrays.equals(c1,c2)){
              System.out.println("anagrams");
          }else {
              System.out.println("not anagrams");
          }
      }else{
          System.out.println("not anagrams");
      }

}
}
