package week6.HA6;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class W3schools extends W3baseClass{
@DataProvider(name="getData")
public String [][] dtProvider() throws IOException{
return W3excel.w3excelData();
}
@Test(dataProvider="getData")
public void registerOnW3schools(String fname, String email, String addr, String city, String state, String zip, String cvv, String cnum, String cname) {
	WebElement iframe = driver.findElement(By.id("iframeResult"));
	driver.switchTo().frame(iframe);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(By.id("fname")).sendKeys(fname);
	driver.findElement(By.id("email")).sendKeys(email);
	driver.findElement(By.id("adr")).sendKeys(addr);
	driver.findElement(By.id("city")).sendKeys(city);
	driver.findElement(By.id("state")).sendKeys(state);
	driver.findElement(By.id("zip")).sendKeys(zip);
	driver.findElement(By.id("expyear")).sendKeys("2018");
	driver.findElement(By.id("cvv")).sendKeys(cvv);
	driver.findElement(By.id("expmonth")).sendKeys("Oct");
	driver.findElement(By.id("ccnum")).sendKeys(cnum);
	driver.findElement(By.id("cname")).sendKeys(cname);
}


}
