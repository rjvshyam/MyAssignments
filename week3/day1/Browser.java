package week3.day1;

public class Browser {
	
String browserName = "Chrome";
float browserVersion = 15.0f;

public void openURL() {
System.out.println("from Browser class");	
}
public void closeBrowser() {
System.out.println("from Browser class");
}
public void navigateBack() {
System.out.println("from Browser class");
}
public static void main(String[] args) {
Browser parent = new Browser();
parent.openURL();
parent.closeBrowser();
parent.navigateBack();

}
}
