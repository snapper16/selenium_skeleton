package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTestObject {
	public static WebDriver driver = new FirefoxDriver();
	
	@BeforeSuite(alwaysRun = true)
	public void sample(){
		
		driver.get("https://www.google.co.in/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println("test case started");
	}
	
	@AfterSuite
	public void afterrun(){
		System.out.println("closing the browser");
		driver.quit();
	}

}
