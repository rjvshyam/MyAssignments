package week4.day1;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class iFrameWithAlertInteractions {

public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();
ChromeDriver driver = new ChromeDriver();
driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
driver.manage().window().maximize();
WebElement element = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
driver.switchTo().frame(element);
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.findElement(By.xpath("//button[text()='Try it']")).click();
//driver.switchTo().defaultContent();
Alert alert = driver.switchTo().alert();
alert.accept();
//driver.switchTo().frame(element);
String msg = driver.findElement(By.xpath("//p[@id='demo']")).getText();
System.out.println(msg);
if (msg.contains("You pressed OK!")) {
	System.out.println("User clicked on OK button");}
else {
	System.out.println("User clicked on Cancel button");
}

	}

}
