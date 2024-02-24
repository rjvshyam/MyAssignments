package week3.HA3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ListAJIO {

public static void main(String[] args) throws InterruptedException {

WebDriverManager.chromedriver().setup();
ChromeDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.get("https://www.ajio.com/");
driver.findElement(By.name("searchVal")).sendKeys("bags" + Keys.ENTER);
driver.findElement(By.xpath("//label[contains(text(),'Men')]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//label[contains(text(),'Fashion')]")).click();
Thread.sleep(2000);
String itemsCount=driver.findElement(By.xpath("//div[@class='length']/strong")).getText();
System.out.println(itemsCount);
System.out.println("**************************");
List<WebElement>brandsName=driver.findElements(By.className("brand"));
//List<String> brandsList = new ArrayList<String>();
int brandsCount=brandsName.size();
System.out.println(brandsCount);

for (WebElement i : brandsName) {
	String var1 = i.getText();
	System.out.println(var1);
}
System.out.println("**************************");
List<WebElement>bagsName=driver.findElements(By.className("nameCls"));
int bagsCount=bagsName.size();
System.out.println(bagsCount);
for (WebElement j : bagsName) {
	String var2 = j.getText();
	System.out.println(var2);
}






}
}
/*driver.findElement(By.xpath("//span[text()='MEN']")).click();
driver.findElement(By.xpath("(//a[text()='CATEGORIES'])[1]")).click();
driver.findElement(By.xpath("//a[text()='Bags & Wallets']")).click();*/