package practice;

public class DuplicateStringInArray {
	
	public static void main(String[] args) {
		
	
	// program fails for 
	//	String ar[] = {"java","c","c++","c++","c++","java","java","java"}; 
		//so use program of HashMap
	String ar[] = {"java","c","c++","c++"};
	int count=1;
	for(int i=0;i<ar.length;i++) {
		for(int j=i+1;j<ar.length;j++) {
			if(ar[i]==ar[j]) {
				count++;	
				System.out.println("duplicate string in an array is: "+ar[i]+"\noccurances: "+count);
			}
		}
		
	}
	
	}
	
	

}
