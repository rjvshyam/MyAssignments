package pagesPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import basePOM.BaseClassLeads;

public class ViewLead extends BaseClassLeads{
	
public ViewLead (ChromeDriver driver) {
	this.driver=driver;
}
public void viewLead() {
	String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
	if (text.contains("Testleaf")) {
		System.out.println("Lead created successfully");
	}
	else {
		System.out.println("Lead is not created");
	}
}

}
