package week2.HA;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkboxes {

public static void main(String[] args) throws InterruptedException {

WebDriverManager.chromedriver().setup();
ChromeDriver driver = new ChromeDriver();
driver.get("https://leafground.com/checkbox.xhtml");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.findElement(By.xpath("//span[text()='Basic']")).click();
driver.findElement(By.xpath("//span[text()='Ajax']")).click();
String ajaxCheck = driver.findElement(By.xpath("//span[text()='Checked']")).getText();
if (ajaxCheck !=null) {
System.out.println("Ajax :"+ajaxCheck);}
Thread.sleep(5000);
driver.findElement(By.xpath("//label[text()='Java']")).click();
driver.findElement(By.xpath("//div[@data-iconstates='[\"\",\"ui-icon ui-icon-check\",\"ui-icon ui-icon-closethick\"]']")).click();//Relative xpath
String tristateCheck = driver.findElement(By.xpath("//div[@class='ui-growl-message']/p[text()='State = 1']")).getText();
if (tristateCheck !=null) {
System.out.println("Tristate :"+tristateCheck);}
Thread.sleep(5000);
driver.findElement(By.className("ui-toggleswitch-slider")).click();
String toggleCheck = driver.findElement(By.xpath("//div[@class='ui-growl-message']/span[text()='Checked']")).getText();
if (toggleCheck != null) {
System.out.println("ToggleCheck :"+toggleCheck);}
String disabledCheck = driver.findElement(By.xpath("//span[text()='Disabled']")).getText();
if (disabledCheck != null) {
System.out.println("DisabledCheck :"+disabledCheck);}
driver.findElement(By.xpath("//ul[@data-label='Cities']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//li[@data-item-value='Paris']/label[text()='Paris']")).click();
driver.findElement(By.xpath("//li[@data-item-value='Berlin']/label[text()='Berlin']")).click();
driver.findElement(By.xpath("//li[@data-item-value='Amsterdam']/label[text()='Amsterdam']")).click();
String city1, city2, city3;
System.out.println(city1=driver.findElement(By.xpath("//span[text()='Paris']")).getText());
System.out.println(city2=driver.findElement(By.xpath("//span[text()='Berlin']")).getText());
System.out.println(city3=driver.findElement(By.xpath("//span[text()='Amsterdam']")).getText());
driver.close();

}
}
