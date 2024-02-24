package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath_FB {

public static void main(String[] args) {

	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	//implicit wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("rjvshyam@gmail.com");
	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("1Face@fbook");
	driver.findElement(By.xpath("//button[@name='login']")).click();
	driver.findElement(By.xpath("(//span[contains(text(),'Find fri')])[2]")).click();
	driver.close();


}
}
