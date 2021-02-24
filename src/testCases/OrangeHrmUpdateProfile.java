package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import pageObject.UpdateProfileObjects2;

public class OrangeHrmUpdateProfile {
	
	@Test
	public void updateProfile() {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shano\\eclipse-workspace\\PageObjectModel\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().window().maximize();
		
		
		UpdateProfileObjects2.username(driver).sendKeys("admin");
		UpdateProfileObjects2.password(driver).sendKeys("admin123");
		UpdateProfileObjects2.login(driver).click();
		UpdateProfileObjects2.myInfo(driver).click();
		UpdateProfileObjects2.editBtn(driver).click();
		UpdateProfileObjects2.fullName(driver).clear();
		UpdateProfileObjects2.fullName(driver).sendKeys("Praveen");
		UpdateProfileObjects2.midName(driver).sendKeys(" ");
		UpdateProfileObjects2.lName(driver).clear();
		UpdateProfileObjects2.lName(driver).sendKeys("Kumar");
		UpdateProfileObjects2.editBtn(driver).click();
		 driver.close(); 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * WebElement username = driver.findElement(By.name("txtUsername"));
		 * username.sendKeys("admin");
		 * 
		 * 
		 * WebElement password = driver.findElement(By.name("txtPassword"));
		 * password.sendKeys("admin123");
		 * 
		 * WebElement login = driver.findElement(By.name("Submit")); login.click();
		 * 
		 * 
		 * 
		 * WebElement myInfo = driver.findElement(By.xpath("//b[text()='My Info']"));
		 * myInfo.click();
		 * 
		 * WebElement editBtn = driver.findElement(By.id("btnSave")); editBtn.click();
		 * 
		 * WebElement fullName =
		 * driver.findElement(By.name("personal[txtEmpFirstName]"));
		 * 
		 * Actions a = new Actions(driver); a.doubleClick(fullName).perform();
		 * 
		 * fullName.sendKeys("Praveen");
		 * 
		 * 
		 * WebElement midName =
		 * driver.findElement(By.name("personal[txtEmpMiddleName]"));
		 * a.doubleClick(midName).perform();
		 * 
		 * midName.sendKeys(" ");
		 * 
		 * 
		 * WebElement lName = driver.findElement(By.name("personal[txtEmpLastName]"));
		 * a.doubleClick(lName).perform();
		 * 
		 * lName.sendKeys("Kumar");
		 * 
		 * 
		 * editBtn.click();
		 * 
		 * 
		 * driver.quit();
		 */
		
		
		 
		 
		
	}


}
