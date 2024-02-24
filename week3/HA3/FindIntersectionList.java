package week3.HA3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindIntersectionList {

public static void main(String[] args) {
Integer [] arr1 = {3,2,11,4,6,7};
Integer [] arr2 = {1,2,8,4,9,7};

List<Integer> arrList1=new ArrayList<Integer>();
List<Integer> arrList2=new ArrayList<Integer>();

arrList1.addAll(Arrays.asList(arr1));
arrList2.addAll(Arrays.asList(arr2));

for (Integer i : arrList1) {
	for (Integer j : arrList2) 
	if (i==j) 
		System.out.println(j);
}

}
}
