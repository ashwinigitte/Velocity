package practice;

public class LengthOfStringWithoutUsingInbuildMethod {
public static void main(String[] args) {
	String s = "ashwini";
char c[] = s.toCharArray();
int count=0;
for(char each:c)
	count++;
System.out.println(count);
}

}
