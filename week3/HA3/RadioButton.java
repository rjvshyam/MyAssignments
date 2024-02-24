package week3.HA3;

public class RadioButton extends Button{

public void selectRadioButton() {
System.out.println("selectRadioButton method is from RadioButton additional sub-class");
}
	
public static void main(String[] args) {
RadioButton obj = new RadioButton();

obj.click();
obj.selectRadioButton();
obj.setText("this from GP class");
obj.submit();

	}

}
