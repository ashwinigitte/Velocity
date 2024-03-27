package practice;

import java.util.ArrayList;
import java.util.TreeSet;

public class SecondLargestNum {
public static void main(String[] args) {
int a[] = {1,2,44,99,34,56};
	
	TreeSet tr = new TreeSet();
	for(int num:a) {
		tr.add(num);
	}
	
	ArrayList al = new ArrayList(tr);
	System.out.println("second largest number:"+al.get(al.size()-2));
	System.out.println("second lowest number:"+al.get(1));
	
}
	
}
