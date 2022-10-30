package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {

	static WebDriver driver;
	String appUrl = "https://www.facebook.com";
	
  @BeforeSuite
  public void beforeSuite() {
	  //setup of browser
	  String currDir = System.getProperty("user.dir");
	  
	  System.setProperty("webdriver.chrome.driver", currDir + "\\drivers\\chromedriver.exe");
	  driver = new ChromeDriver();
	  
//	  System.setProperty("webdriver.gecko.driver", currDir + "\\drivers\\geckodriver.exe");
//	  driver = new FirefoxDriver();
	  
	  driver.get(appUrl);
	  
  }

  @AfterSuite
  public void afterSuite() {
	  //close the browser instance
	  driver.quit();
  }

}
