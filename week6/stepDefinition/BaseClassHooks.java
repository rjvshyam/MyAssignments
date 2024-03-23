package stepDefinition;

import java.time.Duration;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClassHooks extends AbstractTestNGCucumberTests{
	
//static->it will pass common driver value to all the step definition
	public static ChromeDriver driver;
//Cucumber Annotations(Hooks)-> @Before @After wont work hence using TestNG annotations
	@BeforeMethod
	public void precondition() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));		
	}
	@AfterMethod
	public void postcondition() {
	driver.close();
		
	}

}
