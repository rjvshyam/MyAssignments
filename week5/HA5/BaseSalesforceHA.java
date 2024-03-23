package week5.HA5;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseSalesforceHA {

public RemoteWebDriver driver;	
@Parameters({"browser", "url", "username", "password"})
@BeforeMethod
public void sfPrecondition(String browser, String url, String uName, String pswd) throws InterruptedException{
if (browser.equalsIgnoreCase("chrome")) {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();}
else if (browser.equalsIgnoreCase("edge")) {
	WebDriverManager.edgedriver().setup();
	driver = new EdgeDriver();}
driver.manage().window().maximize();
driver.get(url);
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.findElement(By.id("username")).sendKeys(uName);
driver.findElement(By.id("password")).sendKeys(pswd);
driver.findElement(By.id("Login")).click();
Thread.sleep(6000);
driver.findElement(By.xpath("//span[text()='Learn More']")).click();
Thread.sleep(6000);
Set<String> window = driver.getWindowHandles();
List<String> firstWindow = new ArrayList<String>(window);
driver.switchTo().window(firstWindow.get(1));
driver.findElement(By.xpath("//button[text()='Confirm']")).click();
Thread.sleep(6000);
WebElement root=driver.findElement(By.tagName("hgf-c360nav"));
//shadowDOM using JavascriptExecutor and CSS->https://www.youtube.com/watch?v=bpzyjNZ0jaw
JavascriptExecutor js1 = (JavascriptExecutor)driver;
SearchContext shadowDom1=(SearchContext)js1.executeScript("return arguments[0].shadowRoot", root);
WebElement header = shadowDom1.findElement(By.cssSelector("header>div.c360-nav__header>div.c360-nav__wrapper"));//>nav>ul>li:nth-child(4)>h3>hgf-button>div>div
//https://stackoverflow.com/questions/33939198/selenium-webdriver-finding-elements-using-cssselector-and-nth-child
WebElement navli4 = header.findElement(By.cssSelector("nav.c360-nav__nav-items>ul>li:nth-child(4)"));
navli4.findElement(By.cssSelector("h3>hgf-button>span.nav-item-label--l1")).click();//Learning tab
WebElement trailHead = navli4.findElement(By.cssSelector("div>div>div>ul>li:nth-child(1)>div>hgf-button>div>span"));//>
Thread.sleep(3000);
Actions act = new Actions(driver);
act.moveToElement(trailHead).perform();
WebElement div = navli4.findElement(By.cssSelector("div>div>div>ul>li:nth-child(1)>div:nth-child(3)>div>hgf-c360panellinkedlist:nth-child(2)"));
JavascriptExecutor js4 = (JavascriptExecutor)driver;
SearchContext shadowDom4 = (SearchContext)js4.executeScript("return arguments[0].shadowRoot", div);
WebElement sfCert = shadowDom4.findElement(By.cssSelector("div>ul:nth-child(2)>li:nth-child(3)>h4>a"));//>>>h4>a
Actions act1 = new Actions(driver);
act1.moveToElement(sfCert).click().perform();
}

@AfterMethod
public void postCondition() {
driver.quit();
}
}