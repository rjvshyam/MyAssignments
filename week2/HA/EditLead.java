package week2.HA;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

public static void main(String[] args) {

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
driver.findElement(By.linkText("Create Lead")).click();
driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("t-leaf");
driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("first");
driver.findElement(By.xpath("(//input[@name='lastName'])[3]")).sendKeys("last");
driver.findElement(By.xpath("//input[@name='firstNameLocal']")).sendKeys("local");
driver.findElement(By.xpath("//input[@name='departmentName']")).sendKeys("dept");
driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("description * ^ description");
driver.findElement(By.xpath("(//input[@name='primaryEmail'])[4]")).sendKeys("google@gmail.com");
WebElement state = driver.findElement(By.xpath("//select[@name='generalStateProvinceGeoId']"));
Select stateValue = new Select(state);
stateValue.selectByVisibleText("New York");
driver.findElement(By.xpath("//input[@name='submitButton']")).click();
driver.findElement(By.xpath("(//div[@class='frameSectionExtra']/a)[3]")).click();
driver.findElement(By.xpath("//textarea[@name='description']")).clear();
driver.findElement(By.xpath("//textarea[@id='updateLeadForm_importantNote']")).sendKeys("cleared the description");
driver.findElement(By.xpath("(//input[@class='smallSubmit'])[1]")).click();
System.out.println(driver.getTitle());
driver.close();

}
}
