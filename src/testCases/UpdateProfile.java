package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UpdateProfile {

	@Test
	public void login() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shano\\eclipse-workspace\\PageObjectModel\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://phptravels.net/login");
		Thread.sleep(500);

		
		 WebElement userName = driver.findElement(By.name("username"));
		  userName.sendKeys("user@phptravels.com");
		  
		  WebElement password = driver.findElement(By.name("password"));
		  password.sendKeys("demouser");
		  
		  WebElement loginButton = driver.findElement(By.
		  xpath("//button[@class='btn btn-primary btn-lg btn-block loginbtn']"));
		  loginButton.click();
		  
		  
		  WebElement myProfile =
		  driver.findElement(By.xpath("(//a[@data-toggle='tab'])[2]"));
		  myProfile.click();
		  
		  
		  
		  WebElement phone = driver.findElement(By.name("phone"));
		  phone.sendKeys("9123456789");
		  
		  WebElement city = driver.findElement(By.name("city"));
		  city.sendKeys("Mumbai");
		  
		  
		  WebElement submit = driver.findElement(By.xpath("//button[@class='btn btn-block updateprofile btn-primary']"));
		  submit.click();
		 

	}

}
