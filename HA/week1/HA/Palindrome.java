package week1.HA;

public class Palindrome {

public static void main(String[] args) {
int num = 121, sum, temp, digit;
temp=num;
for (sum=0; temp>0; temp/=10) {
	digit = temp % 10;
	sum=(sum*10)+digit;
}
if (sum==num) {
System.out.println("Number is palindrome:"+num);
} else
{System.out.println("Number is not palindrome:"+num);
}
	

}
}
