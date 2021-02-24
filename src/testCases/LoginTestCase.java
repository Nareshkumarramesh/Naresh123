package testCases;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pageObject.LoginPageObjects;

public class LoginTestCase {

	@Test
	public void login() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shano\\eclipse-workspace\\PageObjectModel\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://phptravels.net/login");
		Thread.sleep(3000);
		
		
		
		LoginPageObjects.userName(driver).sendKeys("user@phptravels.com");
		LoginPageObjects.password(driver).sendKeys("demouser");
		LoginPageObjects.loginButton(driver).click();

		/*
		 * WebElement userName = driver.findElement(By.name("username"));
		 * userName.sendKeys("user@phptravels.com");
		 * 
		 * WebElement password = driver.findElement(By.name("password"));
		 * password.sendKeys("demouser");
		 * 
		 * WebElement loginButton = driver.findElement(By.
		 * xpath("//button[@class='btn btn-primary btn-lg btn-block loginbtn']"));
		 * loginButton.click();
		 * 
		 * 
		 * driver.quit();
		 * 
		 * 
		 * 
		 */
	}

}
