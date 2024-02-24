package week1.day2;

import java.util.Arrays;

public class ForLoop {

public static void main(String[] args) {

int [] num = {15, 7, 24, 10, 28, 15, 21, 22, 21, 10, 15, 7};
/*System.out.println(num.length);
System.out.println(num[0]);
for (int i = 0; i < num.length; i++) {
	System.out.println("Printing using for loop :" + num[i]);
}*/
//nested for loop to print duplicate values
/*for (int i = 0; i < num.length; i++) {
	for (int j = i+1; j < num.length; j++) {
		if(num[i]==num[j]) {
			System.out.println("NestedLoop duplicate number :"+num[i]);
		}
		
	}
}*/
Arrays.sort(num);
for (int i = 0; i<num.length-1; i++) {
	if (num[i]==num[i+1]) {
		System.out.println("SingleLoop duplicate number :"+num[i]);
	}
}


/*
for (int i = 0; i < num.length; i++) {
	System.out.println("Printing after sort and using for loop :" + num[i]);
}*/




}
}
