package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OrangeHrmLogin {
	
	
	
	@Test
	
	public void login() {
	
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shano\\eclipse-workspace\\PageObjectModel\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().window().maximize();
		
		
		WebElement username = driver.findElement(By.name("txtUsername"));
		username.sendKeys("admin");
		
		
		WebElement password = driver.findElement(By.name("txtPassword"));
		password.sendKeys("admin123");
		
		WebElement login = driver.findElement(By.name("Submit"));
		login.click();
		
		WebElement myInfo = driver.findElement(By.xpath("//b[text()='My Info']"));
		myInfo.click();
		
		
		
		
		
		
		
		
		
		
		
	}

}
