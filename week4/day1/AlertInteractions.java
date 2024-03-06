package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertInteractions {

public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();
ChromeDriver driver = new ChromeDriver();
driver.get("https://www.leafground.com/alert.xhtml");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
Alert alert = driver.switchTo().alert();
alert.sendKeys("shyam");
Thread.sleep(2000);
alert.dismiss();
String prompMsg = driver.findElement(By.xpath("//span[@id='confirm_result']")).getText();
System.out.println(prompMsg);

	}

}
