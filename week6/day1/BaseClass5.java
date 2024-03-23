package week6.day1;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass5 {
//step3-common data integration
//create global variable
public static RemoteWebDriver driver; 
	public String filedata;
@Parameters({"browser", "url", "username", "password"})
@BeforeMethod
public void preCondition(String browser, String url, String uName, String pwd){
		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver  = new ChromeDriver();	}
		else if (browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys(uName);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();	
}

@AfterMethod
public void postCondition() {
	driver.close();
}
/*common data integration
step1-common data integration*///indices index start from 0
@DataProvider(name="getData",indices=0)//indices={0,2} will run two rows
public String [][] sendData() throws IOException {
return ReadFromExcel5.excelData(filedata);
//step4-common data integration - assign global variable
}
}
