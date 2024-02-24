package week3.HA3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionSorting {

public static void main(String[] args) {

String [] arr = {"HCL", "Wipro", "Aspire Systems", "CTS"};
List<String> arrList = new ArrayList<String>();

arrList.addAll(Arrays.asList(arr));
Collections.sort(arrList);
//Collections.reverse(arrList);
for (int i=arrList.size()-1; i>=0; i--) {
System.out.println(arrList.get(i));
}

}
}
