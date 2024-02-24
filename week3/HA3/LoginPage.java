package week3.HA3;

public class LoginPage extends BasePage{

public void performCommonTasks() {
	System.out.println("Im derived superclass");}
	
public static void main(String[] args) {

LoginPage obj1 = new LoginPage();
BasePage obj2 = new BasePage();

obj1.performCommonTasks();
obj2.findElement();
obj2.clickElement();
obj2.performCommonTasks();
obj2.enterText();
	

}
}
