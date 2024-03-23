package stepDefinition;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Redhat_Registration extends BaseClass{

@Given("Launch the browser and load the Redhat url")
public void precondition() {
	WebDriverManager.chromedriver().setup();
	ChromeOptions op = new ChromeOptions();
	op.addArguments("--disable-notifications");
	op.addArguments("--start-maximized");
	//op.addArguments("--headless");
	driver = new ChromeDriver(op);
	driver.get("https://access.redhat.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
}
@When("Click on the Register link button")
public void registerLink() {
driver.findElement(By.xpath("//pfe-cta[@id='cta-register']/a")).click();
}
@Then("Verify Registration form is displayed")
public void verifyRegisterForm() {
String regForm = driver.findElement(By.xpath("//form[@id='kc-register-form']/h1")).getText();
if (regForm.contains("Register for a Red Hat account")) {
	System.out.println("Registration form is displaying");
} else {
	System.out.println("Registration form not displaying");}
}
@When("Enter the redhat Username as {string}")
public void redhatUsername(String uName) {
driver.findElement(By.id("username")).sendKeys(uName);
}
@And("Enter the redhat Password as {string}")
public void redhatPswd(String pswd) {
driver.findElement(By.id("password")).sendKeys(pswd);
}
@And("Enter the Confirm redhat Password as {string}")
public void confirmPswd(String cPswd) {
driver.findElement(By.name("confirmPassword")).sendKeys(cPswd);
}
@And("Enter the redhat Firstname as {string}")
public void firstName(String fName) {
driver.findElement(By.id("firstName")).sendKeys(fName);	
}
@And("Enter the redhat Lastname as {string}")
public void lastName(String lName) {
driver.findElement(By.id("lastName")).sendKeys(lName);	
}
@And("Enter the redhat Email as {string}")
public void enter_the_redhat_email_as(String email) {
driver.findElement(By.id("email")).sendKeys(email);
}
@And("Enter the redhat Phone as (.*)$")
public void enter_the_redhat_phone_as(String phN) {
driver.findElement(By.id("user.attributes.phoneNumber")).sendKeys(phN);
}
@And("Choose the redhat AccountType as Personal")
public void choose_the_redhat_account_type_as_personal() {
driver.findElement(By.xpath("//label[text()='Personal']")).click();
}
@And("Select the redhat Country as India")
public void select_the_redhat_country_as_india() {
WebElement country = driver.findElement(By.name("user.attributes.country"));
Select countryValue = new Select(country);
countryValue.selectByVisibleText("India");
}
@And("Enter the redhat Address1 as {string}")
public void enter_the_redhat_address1(String hNo) {
driver.findElement(By.id("user.attributes.addressLine1")).sendKeys(hNo);
}
@And("Enter the redhat Address2 as Big Street")
public void enter_the_redhat_address2() {
driver.findElement(By.id("user.attributes.addressLine2")).sendKeys("Big Street");
}
@And("Enter the redhat Address3 as Main Nagar")
public void enter_the_redhat_address3() {
driver.findElement(By.id("user.attributes.addressLine3")).sendKeys("Main Nagar");
}
@And("Enter the redhat Address4 as Anakaputhur")
public void enter_the_redhat_address4() {
driver.findElement(By.id("user.attributes.addressLine4")).sendKeys("Anakaputhur");
}
@And("Enter the redhat Postal as (.*)$")
public void enter_the_redhat_postal(String pCode) {
driver.findElement(By.id("user.attributes.addressPostalCode")).sendKeys(pCode);
}
@And("Enter the redhat City as Chennai")
public void enter_the_redhat_city() {
driver.findElement(By.id("user.attributes.addressCityText")).sendKeys("Chennai");
}
@And("Select the redhat State")
public void select_the_redhat_state() {
WebElement state = driver.findElement(By.id("user.attributes.addressState"));
Select stateValue = new Select(state);
stateValue.selectByValue("TN");
}
@Then("Close the browser")
public void close_the_browser() {
driver.close();
}



}
