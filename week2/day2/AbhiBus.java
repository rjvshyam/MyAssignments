package week2.day2;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.Shadow;

public class AbhiBus {

public static void main(String[] args) throws InterruptedException {

WebDriverManager.chromedriver().setup();
ChromeDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.abhibus.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
Shadow dom = new Shadow(driver);
dom.findElementByXPath("//input[@placeholder='From Station']").click();
dom.findElementByXPath("//input[@placeholder='From Station']").sendKeys("Chennai");
Thread.sleep(1000);
dom.findElementByXPath("(//div[text()='Chennai'])[1]").click();
dom.findElementByXPath("//input[@placeholder='To Station']").click();
dom.findElementByXPath("//input[@placeholder='To Station']").sendKeys("Bangalore");
Thread.sleep(1000);
dom.findElementByXPath("(//div[text()='Bangalore'])[1]").click();

/*driver.findElement(By.xpath("//input[@placeholder='From Station']")).click();
driver.findElement(By.xpath("//input[@placeholder='From Station']")).sendKeys("Chennai");
driver.findElement(By.xpath("(//div[text()='Chennai'])[1]")).click();
driver.findElement(By.xpath("//input[@placeholder='To Station']")).click();
driver.findElement(By.xpath("//input[@placeholder='To Station']")).sendKeys("Bangalore");
driver.findElement(By.xpath("(//div[text()='Bangalore'])[1]")).click();
driver.findElement(By.xpath("//button[text()='Tomorrow']")).click();
String firstBus=driver.findElement(By.xpath("(//h5[@class='title'])[1]")).getText();
System.out.println(firstBus);
driver.findElement(By.xpath("(//button[text()='Show Seats'])[1]")).click();*/




}
}
