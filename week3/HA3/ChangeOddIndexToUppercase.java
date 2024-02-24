package week3.HA3;

public class ChangeOddIndexToUppercase {

public static void main(String[] args) {
String test = "changeme";
//char[] CharArray = test.toCharArray();

for (char i=0; i<=test.length()-1; i++) {
	if (i%2==0) 		
	System.out.print(test.charAt(i));
	if (i%2==1) 
	System.out.print(test.toUpperCase().charAt(i));
	}
	/*if (i%2==1) 
		test.toUpperCase();
		System.out.print(test);	*/
	

	
}
}
