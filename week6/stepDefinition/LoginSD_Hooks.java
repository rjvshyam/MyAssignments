package stepDefinition;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSD_Hooks extends BaseClassHooks{

/*@Given("Hooks Launch the browser and Load the Url")
public void precondition() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
}	*/
@When("Hooks Enter the user as Demosalesmanager")
public void enterUsername() {
	driver.findElement(By.id("username")).sendKeys("demosalesmanager");
}
@And("Hooks Enter the password as crmsfa")
public void enterPassword() {
	driver.findElement(By.id("password")).sendKeys("crmsfa");
}
@And("Hooks Click on Login button")
public void clickLogin() {
	driver.findElement(By.className("decorativeSubmit")).click();
}
@Then("Hooks Homepage should be displayed")
public void verifyPage() {
	String title = driver.getTitle();
	if (title.contains("Automation ")) {
		System.out.println("Login successfully");
	} else
	{System.out.println("Login unsuccessful");
}
}

}

	

