package week6.day1;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead5 extends BaseClass5{
//step5 - common data integration
//create a method and assign Create data excel to created variable
@BeforeTest
public void setData() {
filedata="Sel_Create";
}
@Test(dataProvider="getData")
public void leadCreate5(String cName, String fName, String lName, String ph) {
	System.out.println("driver="+driver);
driver.findElement(By.linkText("Leads")).click();
driver.findElement(By.linkText("Create Lead")).click();
driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(ph);
driver.findElement(By.name("submitButton")).click();
String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
if (text.contains("Testleaf")) {
System.out.println("Lead created successfully");
}
else {
System.out.println("Lead is not created");
}
		


	}

}
