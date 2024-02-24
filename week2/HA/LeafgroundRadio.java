package week2.HA;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafgroundRadio {
//**isSelected always return false only in this site
public static void main(String[] args) {

WebDriverManager.chromedriver().setup();
ChromeDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.get("https://leafground.com/radio.xhtml");
//Favorite radio button section
driver.findElement(By.xpath("//label[text()='Chrome'][1]")).click();
driver.findElement(By.xpath("//label[text()='Chrome'][1]")).click();
boolean status = driver.findElement(By.xpath("//label[text()='Chrome'][1]")).isEnabled();
System.out.println("Favorite radio button status is :"+status);
System.out.println(driver.findElement(By.xpath("//label[text()='Chrome'][1]")).isSelected());
//driver.navigate().refresh();
/*//Favorite radio button section
if (driver.findElement(By.xpath("//label[text()='Chrome'][1]")).isSelected()) {
if (driver.findElement(By.xpath("//label[text()='Firefox'][1]")).isSelected())	{
if (driver.findElement(By.xpath("//label[text()='Safari'][1]")).isSelected()) {
if (driver.findElement(By.xpath("//label[text()='Edge'][1]")).isSelected()) {
System.out.println("Atleast 1 radio button selected by default from"+" : "+"Your Favorite section");
}}}}else {
System.out.println("No radio button selected by default from"+" : "+" Your Favorite section");	
}
//Unselectable section
if (driver.findElement(By.xpath("//label[text()='Chennai']")).isSelected()) {
if (driver.findElement(By.xpath("//label[text()='Bengaluru']")).isSelected()) {
if (driver.findElement(By.xpath("//label[text()='Hyderabad']")).isSelected()){
System.out.println("Atleast 1 radio button selected by default from"+" : "+"Unselected section");
}}} else {
System.out.println("No radio button selected by default from"+" : "+" Unselected section");
}
//Find the default select radio button
if (driver.findElement(By.xpath("//label[@for='j_idt87:console2:0']")).isSelected()) {
if (driver.findElement(By.xpath("//label[@for='j_idt87:console2:1']")).isSelected()) {
if (driver.findElement(By.xpath("//label[@for='j_idt87:console2:3']")).isSelected()) {
if (driver.findElement(By.xpath("//label[@for='j_idt87:console2:2']")).isSelected()) {
System.out.println("Atleast 1 radio button selected by default from"+" : "+"Find the default section");
}}}}else {
System.out.println("No radio button selected by default from"+" : "+" Find the default section");	
}
*/
driver.findElement(By.xpath("//label[normalize-space()='21-40 Years']")).click();
driver.findElement(By.xpath("//label[normalize-space()='21-40 Years']")).click();
System.out.println(driver.findElement(By.xpath("//label[normalize-space()='21-40 Years']")).isSelected());

}
}
