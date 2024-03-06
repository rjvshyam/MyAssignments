package week4.HA4;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetInterface {

public static void main(String[] args) {

String comapnyName = "google";
char[] letter = comapnyName.toCharArray();

for (int i=letter.length-1; i>=0; i--) {
	System.out.print(letter[i]+"*");
}
for (int i=0; i<=letter.length-1; i++) {
	System.out.print(letter[i]);
}
//LinkedHashSet-return in insertion order
//Hashset--return in random order
//Treeset--return in sorting order
Set<Character> unique = new LinkedHashSet<Character>();
for (Character i : letter) {
unique.add(i);
}
System.out.println(unique);

}
}