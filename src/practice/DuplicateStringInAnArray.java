package practice;

import java.util.HashMap;
import java.util.Set;

public class DuplicateStringInAnArray {
	
	public static void main(String[] args) {
		
	

	String ar[] = {"java","c","c++","java","c","java","java"};
	
	HashMap<String, Integer> smap = new HashMap<String, Integer>();
	for(String str1:ar)
		if(smap.containsKey(str1))
			smap.put(str1, smap.get(str1)+1);
		else
			smap.put(str1, 1);
	
	Set<String> keys = smap.keySet();
	for(String key:keys)
		if(smap.get(key)>1)
		System.out.println(key +":"+smap.get(key)+" ");

	}
}
