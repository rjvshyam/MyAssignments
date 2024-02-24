package week3.day1;

public class Chrome extends Browser{

public void openIncognito() {
System.out.println("from Chrome class");
}
public void clearCache() {
System.out.println("from Chrome class");
}
public static void main(String[] args) {
Chrome child1 = new Chrome();
String var1 = child1.browserName;
float var2 = child1.browserVersion;
child1.openURL();
child1.closeBrowser();
child1.navigateBack();
child1.clearCache();
child1.openIncognito();



	}

}
