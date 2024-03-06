package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Draggable {

public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://jqueryui.com/draggable/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	WebElement element = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
	driver.switchTo().frame(element);
	WebElement src = driver.findElement(By.xpath("//p[contains(text(),'Drag me')]"));
	Actions act = new Actions(driver);
	act.dragAndDropBy(src, 150, 50).perform();
	driver.switchTo().defaultContent();
	
	}

}
