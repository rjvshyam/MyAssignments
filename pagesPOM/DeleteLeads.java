package pagesPOM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import basePOM.BaseClassLeads;

public class DeleteLeads extends BaseClassLeads {
	
public DeleteLeads (ChromeDriver driver) {
	this.driver=driver;
}
public DeleteLeads clickFindLeadsTab() {
	driver.findElement(By.linkText("Find Leads")).click();
	return this;
}
public DeleteLeads clickPhoneTab() {
	driver.findElement(By.xpath("//span[text()='Phone']")).click();
	return this;
}
public DeleteLeads enterPhoneNo(String ph) {
	driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(ph);
	return this;
}
public DeleteLeads clickFindLeadsButton() {
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	return this;
}
public DeleteLeads deleteLead() throws InterruptedException {
	Thread.sleep(3000);
	String leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
	driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	Thread.sleep(3000);
	driver.findElement(By.linkText("Delete")).click();
	driver.findElement(By.linkText("Find Leads")).click();
	driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	return this;
}
public void verifyDeletionOfLead() {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	WebElement text = driver.findElement(By.className("x-paging-info"));
	wait.until(ExpectedConditions.visibilityOf(text));
	String text2 = text.getText();
	if (text2.equals("No records to display")) {
	System.out.println("Text matched");
	} else {
	System.out.println("Text not matched");
	}
}

}
