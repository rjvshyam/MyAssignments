package week3.HA3;

public class CheckBoxButton extends Button{

public void clickCheckButton() {
System.out.println("clickCheckButton method is from CheckBoxButton additional sub-class");
}
public static void main(String[] args) {
	CheckBoxButton obj = new CheckBoxButton();
	
obj.click();
obj.clickCheckButton();
obj.setText("Hi from GP class");
obj.submit();

	}

}
