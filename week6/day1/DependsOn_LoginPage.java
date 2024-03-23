package week6.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DependsOn_LoginPage {
	//@Test(dependsOnMethods= {"week6.day1.Invocation_LoginPage.preCondition"})//if parent fails then child will be skipped
	@Test(dependsOnMethods= {"week6.day1.Invocation_LoginPage.preCondition"},alwaysRun=true)//alwaysRun-child tc will run eventhough parent tc fails
	public void preCond(){
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();	
		//driver.close();
}
}

