package basePOM;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilsPOM.ReadFromExcel;

public class BaseClassLeads {

public ChromeDriver driver;
public String filedata;	
@Parameters({"url"})
@BeforeMethod
public void precondition(String url) {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(url);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
@AfterMethod
public void postcondition() {
	driver.close();
}
@DataProvider(name="getData")
public String [][] sendData() throws IOException{
	return ReadFromExcel.excelDataPOM(filedata);
	
	
}

}
