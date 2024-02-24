package week2.HA;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

public static void main(String[] args) throws InterruptedException {

WebDriverManager.chromedriver().setup();
ChromeDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.get("http://leaftaps.com/opentaps/");
driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
driver.findElement(By.className("decorativeSubmit")).click();
driver.findElement(By.linkText("CRM/SFA")).click();
driver.findElement(By.partialLinkText("Lea")).click();
driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
driver.findElement(By.xpath("(//span[@class='x-tab-strip-inner']/span)[2]")).click();
driver.findElement(By.name("phoneCountryCode")).clear();
driver.findElement(By.name("phoneCountryCode")).sendKeys("91");
driver.findElement(By.name("phoneAreaCode")).sendKeys("99");
driver.findElement(By.name("phoneNumber")).sendKeys("9876543210");
driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
//driver.findElement(By.xpath("(//tr[@class='x-grid3-hd-row']//div)[1]")).click();
Thread.sleep(1000);
String records=driver.findElement(By.xpath("//div[@id='ext-gen304']/div")).getText();
System.out.println(records);
String [] parts = records.split(" ", 2);
String part1 = parts[0];
System.out.println(part1);
if (part1.contains("No")) {
System.out.println("No records available with this phone#9876543210");
driver.close();
} else {
String firstID=driver.findElement(By.xpath("(//table[@class='x-grid3-row-table'])[1]//a")).getText();
System.out.println(firstID);
driver.findElement(By.xpath("(//table[@class='x-grid3-row-table'])[1]//a")).click();
driver.findElement(By.xpath("//a[text()='Delete']")).click();
driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
driver.findElement(By.name("id")).sendKeys(firstID);
driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
String noRecords=driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
if (noRecords.contains("No records to display")) {
System.out.println("Record no. "+firstID+" successfully deleted");
driver.close();
}}


}
}