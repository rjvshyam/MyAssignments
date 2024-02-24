package week3.day1;

public class Edge extends Browser{
	
public void takeSnap() {
System.out.println("from Edge class");
}
public void clearCookies() {
System.out.println("from Edge class");
}
public static void main(String[] args) {
Edge child2 = new Edge();
child2.openURL();
child2.closeBrowser();
child2.navigateBack();
child2.takeSnap();
child2.clearCookies();


	}

}
