package practice;

public class SortAnArray {
	public static void main(String[] args) {
		
	
	int a[] = {1,2,5,7,22,11,4,0,99,100,92};
	int temp = 0;
	for(int i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++) {
			if(a[i]>a[j]) {
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				
			
			}
			
		} System.out.print(a[i]+" ");
		
	}
	
		
		
	}

}

