package runner;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWait {

public static void main(String[] args) {

WebDriverManager.chromedriver().setup();
ChromeDriver driver = new ChromeDriver();
driver.manage().window().maximize();
//driver.get("https://www.leafground.com/window.xhtml");
driver.get("https://www.leafground.com/waits.xhtml");
//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//open with delay
//WebElement window = driver.findElement(By.xpath("//span[text()='Open with delay']"));
//window.click();
driver.findElement(By.xpath("(//span[text()='Click'])[1]")).click();
WebElement data = driver.findElement(By.xpath("//span[text()='I am here']"));
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//wait.until(ExpectedConditions.numberOfWindowsToBe(3));//including main window
wait.until(ExpectedConditions.visibilityOf(data));
//driver.quit();

}
}
