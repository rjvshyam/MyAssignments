package week3.day1;

public class StringToCharArray {

public static void main(String[] args) {
String cn = "Testleaf";

char[] comp=cn.toCharArray();
for (int i=comp.length-1; i>=0; i--) {
System.out.print(comp[i]);
}

	}

}
