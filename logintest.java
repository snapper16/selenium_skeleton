package test;

import org.testng.annotations.Test;
import pages.login;

public class logintest extends BaseTestObject {
	
	login lg = new login(driver);
	
	/*@Test(priority=1)
	public void resgistration() throws InterruptedException{
		System.out.println("clicking on signup");
		lg.clickSignup();
		Thread.sleep(5000);
		lg.enteremail();
		lg.confirmenteremail();
		lg.password();
		lg.confirmpassword();
	}*/
	
	@Test
	public void ajaxtest(){
		lg.test1();
	}
	
	
	

}
