package stepDefinition;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StaticLogin extends BaseClass{

/*@Given("Launch the browser and Load the Url")
public void precond() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
}*/
@When("Enter the user as {string}")
public void enterUser(String uName) {
	driver.findElement(By.id("username")).sendKeys(uName);
}
@And("Enter the password as {string}")
public void enterPswd(String pswd) {
	driver.findElement(By.id("password")).sendKeys(pswd);
}
/*@And("Click on Login button")
public void clickLog() {
	driver.findElement(By.className("decorativeSubmit")).click();
}*/
@But("Homepage should not be displayed")
public void verifyLoginFail() {
	String title = driver.getTitle();
	if (title.contains("Automation ")) {
		System.out.println("Login not successful");
	} else
	{System.out.println("Login unsuccessful");
}
	driver.close();
}


}
