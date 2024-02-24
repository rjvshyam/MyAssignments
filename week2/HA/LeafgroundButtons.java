package week2.HA;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafgroundButtons {

public static void main(String[] args) {

WebDriverManager.chromedriver().setup();
ChromeDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.get("https://leafground.com/button.xhtml");
driver.findElement(By.xpath("//span[text()='Click']")).click();
System.out.println("Page title is :"+ driver.getTitle());
driver.navigate().back();
boolean enabled =driver.findElement(By.xpath("//button[@aria-disabled='true']")).isEnabled();{
System.out.println("Button enabled :"+enabled);
}
Point location = driver.findElement(By.xpath("//button[@name='j_idt88:j_idt94']/span[text()='Submit']")).getLocation();
System.out.println("Button location :"+location);
String bgcolor=driver.findElement(By.xpath("//span[normalize-space()='Save']")).getCssValue("background-color");
System.out.println("Background color :"+bgcolor);
/*String color = Color.fromString(bgcolor).asHex();
System.out.println(color);*/
Dimension hw=driver.findElement(By.xpath("//button[@name='j_idt88:j_idt98']/span[text()='Submit']")).getSize();
System.out.println("Height and Width of the object is :"+hw.getHeight()+" & "+hw.getWidth());
driver.close();


}
}
