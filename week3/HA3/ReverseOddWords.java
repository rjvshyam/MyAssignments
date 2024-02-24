package week3.HA3;

public class ReverseOddWords {

public static void main(String[] args) {
	
	String text = "I am a software tester";
	String[] split = text.split(" ");
	for (int i =0; i<=split.length-1; i++) {
		if (i%2==0)
		System.out.println(split[i]);
		if (i%2==1) {
			StringBuilder sb = new StringBuilder(split[i]);
			sb.reverse();
		System.out.println(sb.toString());	

		}}
		
	}}

	/*String s="Hello Good morning America";

	String result=reverseAltWords(s);

	System.out.println(result.substring(1));

	}

	public static String reverseAltWords(String s)

	{

	String[] str=s.split(" ");

	String r="";

	for(int i=0;i<str.length;i++)

	{

	if(i%2==1)

	{

	str[i]=reverse(str[i]);

	}

	r=r+" "+str[i];

	}

	return r;

	}

	public static String reverse(String s)

	{

	String rev="";

	for(int i=s.length()-1;i>=0;i--)

	{

	rev=rev+s.charAt(i);

	}

	return rev;

	}

	}*/
	



