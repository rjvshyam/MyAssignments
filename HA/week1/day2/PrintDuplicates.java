package week1.day2;

import java.util.Arrays;

public class PrintDuplicates {

public static void main(String[] args) {

int [] num = {2, 5, 7, 7, 5, 9, 2, 3};

//Duplicate value from nested for loop
for (int i = 0; i<num.length; i++) {
for (int j = i+1; j<num.length; j++) {
if (num[i]==num[j]) {
System.out.println("nested for loop to find duplicate values :"+num[j]);
}}}
Arrays.sort(num);
//After sort finding duplicate values from single for loop
for (int i = 0; i<num.length-1; i++) {
if (num[i]==num[i+1]) {
System.out.println("single for loop to find duplicate values :"+num[i]);
}
}

}
}
