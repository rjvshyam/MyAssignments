package stepDefinition;

import java.time.Duration;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass_Hooks extends AbstractTestNGCucumberTests{
	
public static ChromeDriver driver;

@BeforeMethod
public void preCondition() {
	WebDriverManager.chromedriver().setup();
	ChromeOptions op = new ChromeOptions();
	//op.addArguments("--headless");
	op.addArguments("--disable-notifications");
	op.addArguments("--start-maximized");
	driver = new ChromeDriver(op);
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
}
@AfterMethod
public void postCondition() {
	driver.close();
}

}
