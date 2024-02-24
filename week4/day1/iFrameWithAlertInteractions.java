package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class iFrameWithAlertInteractions {

public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();
ChromeDriver driver = new ChromeDriver();
driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
Thread.sleep(2000);
driver.switchTo().frame(1);
driver.findElement(By.xpath("//button[text()='Try it']")).click();
driver.switchTo().defaultContent();
Alert alert = driver.switchTo().alert();
alert.accept();
driver.switchTo().frame(1);
String msg = driver.findElement(By.xpath("//p[text()='You pressed OK!']")).getText();
System.out.println(msg);

	}

}
