package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class UpdateProfileObjects2 {
	
	
	
	public static WebElement username(WebDriver driver) {
		return driver.findElement(By.name("txtUsername"));

	}
	
	
	public static WebElement password(WebDriver driver) {
		return driver.findElement(By.name("txtPassword"));

	} 
	
	public static WebElement login(WebDriver driver) {
		return driver.findElement(By.name("Submit"));

	} 
	
	public static WebElement myInfo(WebDriver driver) {
		return driver.findElement(By.xpath("//b[text()='My Info']"));

	} 
	
	
	public static WebElement editBtn(WebDriver driver) {
		 return driver.findElement(By.id("btnSave"));	 

	} 
	
	public static WebElement fullName(WebDriver driver) {
		return driver.findElement(By.name("personal[txtEmpFirstName]"));

	} 
	
	public static WebElement midName(WebDriver driver) {
		return driver.findElement(By.name("personal[txtEmpMiddleName]"));

	} 
	
	
	
	public static WebElement lName(WebDriver driver) {
		return driver.findElement(By.name("personal[txtEmpLastName]"));

	} 

}
