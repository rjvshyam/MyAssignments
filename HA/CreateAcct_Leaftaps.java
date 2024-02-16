package week2.HA;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateAcct_Leaftaps {

public static void main(String [] args) {

WebDriverManager.chromedriver().setup();
ChromeDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.get("http://leaftaps.com/opentaps/");
driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
driver.findElement(By.id("password")).sendKeys("crmsfa");
driver.findElement(By.className("decorativeSubmit")).click();
driver.findElement(By.partialLinkText("CRM/")).click();
driver.findElement(By.linkText("Accounts")).click();
driver.findElement(By.linkText("Create Account")).click();
driver.findElement(By.id("accountName")).sendKeys("t-leaf8");
driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
WebElement industry = driver.findElement(By.name("industryEnumId"));
Select industryValue = new Select(industry);
industryValue.selectByVisibleText("Computer Software");
Select ownershipValue = new Select(driver.findElement(By.name("ownershipEnumId")));
ownershipValue.selectByVisibleText("S-Corporation");
Select sourceValue = new Select(driver.findElement(By.id("dataSourceId")));
sourceValue.selectByValue("LEAD_EMPLOYEE");
Select marketingValue = new Select(driver.findElement(By.id("marketingCampaignId")));
marketingValue.selectByIndex(7);
Select stateValue = new Select(driver.findElement(By.id("generalStateProvinceGeoId")));
stateValue.selectByValue("TX");
driver.findElement(By.className("smallSubmit")).click();
String acctName = driver.findElement(By.xpath("//span[contains(text(),'t-leaf')]")).getText();
System.out.println(acctName);
driver.close();
/*if (driver.findElement(By.xpath("//span[contains(text(),'Duplicates found')]")).isDisplayed()) {
System.out.println(driver.findElement(By.xpath("//span[contains(text(),'Duplicates found')]")).getText());
driver.close();}*/
	
}
}
