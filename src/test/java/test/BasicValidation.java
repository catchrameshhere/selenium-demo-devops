package test;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class BasicValidation extends BaseTest{
	
	@Test
	public void titleValidation() {
		
		String expectedTitle = "Facebook – log in or sign up";
		String actualTitle = driver.getTitle();
		
		Reporter.log("Expected page title = " + expectedTitle);
		Reporter.log("Actual page title = " + actualTitle);
		
		assertTrue(actualTitle.equals(expectedTitle), "Page title validation failed,");
	}

	@Test
	public void loginValidation() {
		driver.findElement(By.id("email")).sendKeys("dan@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("test1234");
	}
}
