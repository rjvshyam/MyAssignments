package week3.HA3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MissingElementList {

public static void main(String[] args) {

Integer [] arr = {1,2,3,4,10,6,8};

List<Integer> arrList = new ArrayList<Integer>();

arrList.addAll(Arrays.asList(arr));
Collections.sort(arrList);

for (int i =0; i<=arrList.size()-1; i++) {
	if (arrList.get(i)!=i+1)
		System.out.println(arrList.get(i)-1);
	
	
	}	

}
}

