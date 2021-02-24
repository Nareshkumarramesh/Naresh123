package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UpdateProfileObjects {
	
	
	public WebElement myProfile(WebDriver driver) {
		 return driver.findElement(By.xpath("//a[@onclick='mySelectUpdate']"));
		   
		
	}

	
	public WebElement phoneNumber(WebDriver driver) {
		return driver.findElement(By.name("phone"));
		
	}
	
	
	public WebElement city(WebDriver driver) {
		return driver.findElement(By.name("city"));		

	}
	
	
	public void sumbit() {
		

	}
	
}
