package pagesPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import basePOM.BaseClassLeads;

public class MyHome extends BaseClassLeads{
	
public MyHome (ChromeDriver driver) {
	this.driver=driver;
}
public CreateLead clickLeadsForCreate() {
	driver.findElement(By.linkText("Leads")).click();
	return new CreateLead(driver);
}
public DeleteLeads clickLeadsForDelete() {
	driver.findElement(By.linkText("Leads")).click();
	return new DeleteLeads(driver);
}
public CreateLead clickAccounts() {
	driver.findElement(By.linkText("Accounts")).click();
	return new CreateLead(driver);
}



}
