package pagesPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import basePOM.BaseClassLeads;

public class HomePage extends BaseClassLeads{
	
public HomePage (ChromeDriver driver) {
	this.driver=driver;
}
public MyHome clickCRMlink() {
	driver.findElement(By.linkText("CRM/SFA")).click();	
	return new MyHome(driver);
}
public LoginPage clickLogoutButton() {
	driver.findElement(By.className("decorativeSubmit")).click();
	return new LoginPage(driver);
}

}
