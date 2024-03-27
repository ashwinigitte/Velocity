package practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapPractice{
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> smap = new HashMap<Integer, String>();
		smap.put(1,"mango");

		smap.put(2, "Apple");
		smap.put(3, "pineApple");
		
		Iterator<Map.Entry<Integer, String>> loop = smap.entrySet().iterator();

while(loop.hasNext()) {
	Map.Entry<Integer, String> entry = loop.next();
	int key=entry.getKey();
	String value = entry.getValue();
	System.out.println(key+" : "+ value);
}
	}

}
