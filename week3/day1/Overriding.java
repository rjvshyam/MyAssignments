package week3.day1;

public class Overriding extends Overloading {

public void reportStep(String msg, String status) {
System.out.println(msg + " " + status);	
}

public static void main(String[] args) {

Overriding or = new Overriding();
or.reportStep("second", "second");


	}

}
