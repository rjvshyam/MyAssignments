package week1.day2;

public class Browser {
	
public String launchBrowser(String browserName) {
return browserName;
}

public void loadUrl() {
System.out.println("Application url loaded successfully");
}
	
public static void main(String[] args) {

Browser obj1 = new Browser();
System.out.println(obj1.launchBrowser("Chrome"));
String mthd = obj1.launchBrowser("Edge");
System.out.println(mthd);
obj1.loadUrl();

	}

}
