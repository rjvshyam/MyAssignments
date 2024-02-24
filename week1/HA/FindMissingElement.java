package week1.HA;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		int [] arr= {1,4,3,2,8,6,7};
		Arrays.sort(arr);

		for (int i=0; i<arr.length-1; i++) {
		if (arr[i]!=i+1) {
		System.out.println("Missing element from given array :"+(arr[i]-1));
		break;
		}
		}
	

	}
}
