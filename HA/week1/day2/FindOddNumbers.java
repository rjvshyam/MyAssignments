package week1.day2;

public class FindOddNumbers {

	public static void main(String[] args) {

int maxRange = 10;
for (int i =0; i<=maxRange; i++) {
	if (i%2==1) {
	System.out.println("Odd numbers :"+i);
	}	
}
for (int i=0; i<=maxRange; i++) {
	if (i%2==0) {
	System.out.println("Even numbers :"+i);
	}
}
		
}
}
