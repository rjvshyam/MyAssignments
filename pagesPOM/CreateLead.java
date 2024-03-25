package pagesPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import basePOM.BaseClassLeads;

public class CreateLead extends BaseClassLeads{
	
public CreateLead (ChromeDriver driver) {
	this.driver=driver;
}
public CreateLead clickCreateLeadTab() {
	driver.findElement(By.linkText("Create Lead")).click();
	return this;
}
public CreateLead enterCompanyName(String cName) {
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
	return this;
}
public CreateLead enterFirstName(String fName) {
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
	return this;
}
public CreateLead enterLastName(String lName) {
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
	return this;
}
public CreateLead enterPhNo(String phNo) {
	driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phNo);
	return this;
}
public ViewLead clickCreateLeadButton() {
	driver.findElement(By.name("submitButton")).click();
	return new ViewLead(driver);
}

}
