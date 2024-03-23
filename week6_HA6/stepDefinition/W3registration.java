package stepDefinition;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class W3registration extends BaseClass{

@Given("Launch the browser and load the url")
public void precond() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--disable-notifications");
		//op.addArguments("--headless");
		op.addArguments("--start-maximized");
		driver = new ChromeDriver(op);
		//driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/howto/tryit.asp?filename=tryhow_css_checkout_form");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));	
}
@When("Switch to the iframe")
public void iframe() {
WebElement frame = driver.findElement(By.id("iframeResult"));
driver.switchTo().frame(frame);
}
@And("Enter the Fullname as shyam")
public void userName() {
	driver.findElement(By.id("fname")).sendKeys("shyam");	
}
@And("Enter the Email address as {string}")
public void emailID(String uEmail) {
	driver.findElement(By.id("email")).sendKeys(uEmail);	
}
@And("Enter the Address as {string}")
public void userAddress(String uAddr) {
	driver.findElement(By.id("adr")).sendKeys(uAddr);	
}
@And("Enter the City name as chennai")
public void userCity() {
	driver.findElement(By.id("city")).sendKeys("chennai");	
}
@And("Enter the State name as tamilnadu")
public void userState() {
	driver.findElement(By.id("state")).sendKeys("tamilnadu");	
}
@And("Enter the Zip name as {string}")
public void userZip(String uZip) {
	driver.findElement(By.id("zip")).sendKeys(uZip);	
}
@And("Enter the Expiry year as {string}")
public void cardExpiryYr(String Eyear) {
	driver.findElement(By.id("expyear")).sendKeys(Eyear);	
}
@And("Enter the CVV as {string}")
public void cardCVV(String uCVV) {
	driver.findElement(By.id("cvv")).sendKeys(uCVV);	
}
@And("Enter the Expiry month as October")
public void cardExpiryYrMonth() {
	driver.findElement(By.id("expmonth")).sendKeys("October");	
}
@And("Enter the Credit card number as {string}")
public void cardNumber(String uCnum) {
	driver.findElement(By.id("ccnum")).sendKeys(uCnum);	
}
@And("Enter the Card name as shyamshyam")
public void cardName() {
	driver.findElement(By.id("cname")).sendKeys("shyamshyam");	
}
@And("Click on Checkout button")
public void checkOut() {
driver.findElement(By.xpath("//input[@class='btn']")).click();	
}
@Then("Verify the message for successful registration")
public void messageVerify() {
	/*driver.findElement(By.xpath("//body[@class='w3-container']/h1")).click();
String successMsg = driver.findElement(By.xpath("//body[@class='w3-container']/h1")).getText();*/
driver.findElement(By.xpath("//body[@class='w3-container']//div")).click();
String successMsg = driver.findElement(By.xpath("//body[@class='w3-container']//div")).getText();
	if (successMsg.contains("shyam@gmail.com")) {
		System.out.println("Registration is successful");
	} else {
		System.out.println("Registration is'nt successful");
	}
}
@But("Verify no message for successful registration")
public void nomessageVerify() {
	driver.findElement(By.xpath("//body[@class='w3-container']//div")).click();
	String successMsg = driver.findElement(By.xpath("//body[@class='w3-container']//div")).getText();
		if (successMsg.contains("shyam@gmail.com")) {
			System.out.println("Registration is successful");
		} else {
			System.out.println("Registration is'nt successful");
		}
}

}
