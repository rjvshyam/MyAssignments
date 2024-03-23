package week6.day1;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DeleteLead5 extends BaseClass5{
//step5 - common data integration
//create a method and assign Delete data excel to created variable
@BeforeTest
public void setData() {
filedata="Sel_Delete";
}
@Test(dataProvider="getData")
public void leadDelete5(String ph) throws InterruptedException {
	System.out.println("driver="+driver);
		
driver.findElement(By.linkText("Leads")).click();
driver.findElement(By.linkText("Find Leads")).click();
driver.findElement(By.xpath("//span[text()='Phone']")).click();
driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(ph);
driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
Thread.sleep(2000);
String leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
driver.findElement(By.linkText("Delete")).click();
driver.findElement(By.linkText("Find Leads")).click();
driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
String text = driver.findElement(By.className("x-paging-info")).getText();
if (text.equals("No records to display")) {
System.out.println("Text matched");
} else {
System.out.println("Text not matched");
}
		
}
}