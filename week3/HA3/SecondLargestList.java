package week3.HA3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLargestList {

public static void main(String[] args) {

Integer [] arr = {3,2,11,4,6,7};
Integer last, first;
List<Integer> arrList = new ArrayList<Integer>();

arrList.addAll(Arrays.asList(arr));
Collections.sort(arrList);
first = arrList.get(0);
System.out.println(first);
last = arrList.get(arrList.size()-2);
System.out.println(last);

}
}
