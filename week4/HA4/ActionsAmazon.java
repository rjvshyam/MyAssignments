package week4.HA4;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsAmazon {

public static void main(String[] args) throws IOException, InterruptedException {

WebDriverManager.chromedriver().setup();
ChromeDriver driver = new ChromeDriver();
driver.get("https://www.amazon.in/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro");
Thread.sleep(3000);
driver.findElement(By.xpath("//div[@class='s-suggestion-container']//div[text()='oneplus 9 pro']")).click();
String firstPrice=driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();
System.out.println("First offered price :"+firstPrice);
String rating = driver.findElement(By.xpath("(//span[@class='a-size-base s-underline-text'])[1]")).getText();
System.out.println("Rating :"+rating);
driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();
Set<String> windowHandles = driver.getWindowHandles();
List<String> newBrowser = new ArrayList<String>(windowHandles);
driver.switchTo().window(newBrowser.get(1));
String title = driver.getTitle();
System.out.println(title);
//driver.findElement(By.xpath("(//span[@class='a-button-inner']/input)[7]")).click();
WebElement image = driver.findElement(By.xpath("//div[@id='imgTagWrapperId']"));
File src = image.getScreenshotAs(OutputType.FILE);
File dst = new File("./Snapshot/img.png");
FileUtils.copyFile(src, dst);
Thread.sleep(10000);
driver.findElement(By.xpath("//div[@class='a-box-group']//input[@id='add-to-cart-button']")).click();
String finalPrice = driver.findElement(By.xpath("//div[@id='sw-subtotal']//span[@class='a-price-whole']")).getText();
System.out.println("Final price :"+finalPrice);
if (firstPrice.equals(finalPrice))
	System.out.println("Price is correct");
 else {
	System.out.println("Price is incorrect");
 }
driver.quit();
}
}
