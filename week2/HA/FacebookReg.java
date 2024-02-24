package week2.HA;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookReg {

public static void main(String[] args) {

WebDriverManager.chromedriver().setup();
ChromeDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.get("https://en-gb.facebook.com/");
driver.findElement(By.xpath("//div[@class='_6ltg']/a[@role='button']")).click();//click registration
driver.findElement(By.name("firstname")).sendKeys("first");
driver.findElement(By.name("lastname")).sendKeys("last");
driver.findElement(By.name("reg_email__")).sendKeys("9999999999");
driver.findElement(By.id("password_step_input")).sendKeys("111111111");
WebElement date = driver.findElement(By.id("day"));
WebElement month = driver.findElement(By.id("month"));
Select dateValue = new Select(date);
dateValue.selectByValue("1");
Select monthValue = new Select(month);
monthValue.selectByIndex(6);
Select yearValue = new Select(driver.findElement(By.id("year")));
yearValue.selectByVisibleText("2004");
driver.findElement(By.xpath("//span[@class='_5k_2 _5dba'][2]/input[@name='sex']")).click();
driver.findElement(By.name("websubmit")).click();
driver.close();






}
}
