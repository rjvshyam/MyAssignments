package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandling {

public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.irctc.co.in/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
String windowHandle = driver.getWindowHandle();
System.out.println(windowHandle);
String title = driver.getTitle();
System.out.println(title);
driver.findElement(By.xpath("//a[text()=' FLIGHTS ']")).click();
Set<String> windowHandles = driver.getWindowHandles();
System.out.println(windowHandles);
String parentTitle = driver.getTitle();
System.out.println(parentTitle);
List<String> window = new ArrayList<String>(windowHandles);
driver.switchTo().window(window.get(1));
String childTitle = driver.getTitle();
System.out.println(childTitle);
driver.switchTo().window(window.get(0));
driver.close();

	}

}
