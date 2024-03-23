package week6_HA6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseW3 {

public RemoteWebDriver driver;
@Parameters({"browser", "url"})
@BeforeMethod
public void precondW3(String browser, String url) {
	if (browser.equalsIgnoreCase("chrome")) {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	}
	driver.manage().window().maximize();
	driver.get(url);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
}
@AfterMethod
public void postcondW3() {
	driver.close();
	}
}

***********************************************************************************************************************
	<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
<suite name="Suite" verbose="5">
<parameter name="url" value="https://www.w3schools.com/howto/tryit.asp?filename=tryhow_css_checkout_form"></parameter>
<parameter name="browser" value="chrome"></parameter>
  <test name="Test">

    <classes>
      <class name="week6_HA6.registrationW3"/>
    </classes>
  </test> <!-- Test -->
</suite> <!-- Suite -->

