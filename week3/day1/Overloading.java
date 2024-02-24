package week3.day1;

public class Overloading {
	
public void reportStep(String msg, String status) {
System.out.println(msg + " " + status);
}
public void reportStep(String msg, String status, boolean snap) {
	System.out.println(msg + " " + status+ " " + snap);
}
public static void main(String[] args) {
Overloading ol = new Overloading();
ol.reportStep("first", "first");
ol.reportStep("first", "first", true);

	}

}
