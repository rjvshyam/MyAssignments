package week3.day1;

public class Safari extends Browser {
	
public void readerMode() {
System.out.println("from Safari class");
}
public void fullscreenMode() {
System.out.println("from Safari class");	
}
public static void main(String[] args) {
Safari child3 = new Safari();
child3.closeBrowser();
child3.navigateBack();
child3.openURL();
child3.readerMode();
child3.fullscreenMode();

	}

}
