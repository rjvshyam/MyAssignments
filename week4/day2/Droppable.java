package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Droppable {

public static void main(String[] args) {

	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://jqueryui.com/droppable/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	WebElement element = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
	driver.switchTo().frame(element);
	WebElement src = driver.findElement(By.xpath("//p[contains(text(),'Drag me')]"));
	WebElement tgr = driver.findElement(By.xpath("//p[contains(text(),'Drop here')]"));
	Actions act = new Actions(driver);
	act.dragAndDrop(src, tgr).perform();
	driver.switchTo().defaultContent();

	}

}
