package week3.HA3;

public class DuplicateWords {

public static void main(String[] args) {

String text = "We learn Java basics as part of java sessions in java week 1";
String result="";

String [] split= text.split(" ");
//System.out.println(split[0]);
for (int i = 0; i<split.length; i++) { 
	for (int j = i+1; j<split.length; j++) {
		if (split[i].equalsIgnoreCase(split[j])) {
			split[j]= "";
			
			}}}

for (String word : split) {
	if (word!=""){
		result=result+word+" ";
	}
}
		
System.out.println(result);	
		



}
}
