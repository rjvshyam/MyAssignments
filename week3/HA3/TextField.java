package week3.HA3;

public class TextField extends WebElement{

public void getText() {
System.out.println("getText method is from TextField sub-class");
}
	
public static void main(String[] args) {
	TextField obj = new TextField();
	
obj.getText();
obj.setText("Hi from Parent");
obj.click();

	}

}
