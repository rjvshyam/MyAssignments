package week1.HA;

public class Palindrome {

public static void main(String[] args) {
int input = 121; int output = 0;

for (int i=input; i>0; i/=10) {
int rem = i%10;
output= rem;
if (input==rem) {
System.out.println("Number is palindrome:"+rem);
} else
{System.out.println("Number is not palindrome:"+rem);
}
}

}
}
