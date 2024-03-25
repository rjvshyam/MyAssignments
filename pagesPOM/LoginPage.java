package pagesPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import basePOM.BaseClassLeads;

public class LoginPage extends BaseClassLeads{
	
public LoginPage (ChromeDriver driver){
	this.driver=driver;
}
public LoginPage enterUsername(String uName) {
	driver.findElement(By.id("username")).sendKeys(uName);
	return this;
			
}
public LoginPage enterPassword(String uPswd) {
	driver.findElement(By.id("password")).sendKeys(uPswd);
	return this;
}
public HomePage clickLoginButton() {
	driver.findElement(By.className("decorativeSubmit")).click();
	return new HomePage(driver);
	
}

}
