package pages;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import test.BaseTestObject;

public class login extends BaseTestObject{
	
	  public login(WebDriver driver){
	        this.driver = driver;
	    }
	  WebDriverWait wait ;
	
	
	public void clickSignup(){
		try{
			driver.findElement(By.xpath("html/body/header/div/nav[2]/a[2]")).click();
		}catch(Exception e){
			System.out.println("exception while clicking");
		}
	}
	
	public void enteremail(){
		try{
			driver.findElement(By.cssSelector("#ius-email")).sendKeys("goyal1612@gmail.com");
		}catch(Exception e){
			System.out.println("exception while clicking");
		}
	}
	
	public void confirmenteremail(){
		try{
			driver.findElement(By.cssSelector("#ius-confirm-email-address")).sendKeys("goyal1612@gmail.com");
		}catch(Exception e){
			System.out.println("exception while clicking");
		}
	}
	
	public void password(){
		try{
			driver.findElement(By.cssSelector("#ius-password")).sendKeys("snap@123");
		}catch(Exception e){
			System.out.println("exception while clicking");
		}
	}
	
	public void confirmpassword(){
		try{
			driver.findElement(By.cssSelector("#ius-confirm-password")).sendKeys("snap@123");
		}catch(Exception e){
			System.out.println("exception while clicking");
		}
	}
	
	public void test1(){
		wait = new WebDriverWait(driver, 5);
		driver.findElement(By.name("q")).clear();
		driver.findElement(By.name("q")).sendKeys("shruti");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 WebElement table = driver.findElement(By.className("sbsb_b"));   
		   List<WebElement> rows = table.findElements(By.tagName("li"));   
		   Iterator<WebElement> i = rows.iterator();   
		   System.out.println("-----------------------------------------");   
		   while(i.hasNext()) {   
		           WebElement row = i.next();  
		           System.out.println(row.getText());
		           System.out.println("");   
		           if(row.getText().equals("shruti haasan"))
		        	   row.click();
		           driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		   System.out.println("-----------------------------------------");   
		   }   
	}

}
