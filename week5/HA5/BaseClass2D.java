package week5.HA5;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass2D {

public RemoteWebDriver driver;

@Parameters({"browser", "url", "username", "password"})
@BeforeMethod
public void preCond(String browser, String url, String uName, String pswd){
if (browser.equalsIgnoreCase("chrome")) {
	WebDriverManager.chromedriver().setup();
	driver  = new ChromeDriver();
} else if (browser.equalsIgnoreCase("edge")) {
	WebDriverManager.edgedriver().setup();
	driver = new EdgeDriver();
}
driver.manage().window().maximize();
driver.get(url);
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
driver.findElement(By.id("username")).sendKeys(uName);
driver.findElement(By.id("password")).sendKeys(pswd);
driver.findElement(By.className("decorativeSubmit")).click();
driver.findElement(By.linkText("CRM/SFA")).click();
}

@AfterMethod
public void postcond() {
driver.close();	
}

}
