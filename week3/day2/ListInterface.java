package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ListInterface {

public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
ChromeDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.get("https://www.amazon.in/");
driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phone" + Keys.ENTER);
List<WebElement> phPrices=driver.findElements(By.className("a-price-whole"));
//empty list
List<Integer> allPrices = new ArrayList<Integer>();

for (WebElement i : phPrices) {
String var = i.getText();
System.out.println(var);

String replaceAll = var.replaceAll(",","");

int parseInt = Integer.parseInt(replaceAll);

allPrices.add(parseInt);
}
Collections.sort(allPrices);
System.out.println(allPrices);
System.out.println("This is the cheapest phone price :"+allPrices.get(0));
driver.close();
}
}
