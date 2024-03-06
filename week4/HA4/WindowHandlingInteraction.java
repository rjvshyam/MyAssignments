package week4.HA4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandlingInteraction {

public static void main(String[] args) {

WebDriverManager.chromedriver().setup();
ChromeDriver driver = new ChromeDriver();
driver.get("http://leaftaps.com/opentaps/control/login");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
driver.findElement(By.className("decorativeSubmit")).click();
driver.findElement(By.linkText("CRM/SFA")).click();
driver.findElement(By.linkText("Contacts")).click();
driver.findElement(By.linkText("Merge Contacts")).click();
driver.findElement(By.xpath("(//a/img)[4]")).click();
Set<String> winHandles1=driver.getWindowHandles();
List<String> fromContact = new ArrayList<String>(winHandles1);
driver.switchTo().window(fromContact.get(1));
String child1 = driver.getTitle();
System.out.println(child1+"(1)");
driver.findElement(By.xpath("((//table[@class='x-grid3-row-table'])[1]/tbody/tr/td/div/a[@class='linktext'])[1]")).click();
driver.switchTo().window(fromContact.get(0));
driver.findElement(By.xpath("(//a/img)[5]")).click();
Set<String> winHandles2=driver.getWindowHandles();
List<String> toContact = new ArrayList<String>(winHandles2);
driver.switchTo().window(toContact.get(1));
String child2 = driver.getTitle();
System.out.println(child2+"(2)");
driver.findElement(By.xpath("((//table[@class='x-grid3-row-table'])[2]/tbody/tr/td/div/a[@class='linktext'])[1]")).click();
driver.switchTo().window(toContact.get(0));
driver.findElement(By.xpath("//a[text()='Merge']")).click();
Alert alert = driver.switchTo().alert();
System.out.println(alert.getText());
alert.accept();
String parentTitle = driver.getTitle();
System.out.println(parentTitle);



	

}
}
