package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


import Pom.PomSignup;



public class TestSignUp 
{

	
	@Test(priority=1)
	public void  signUpDetails()
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.developer-connector-mern.com/");
		
		
		PomSignup sign=new PomSignup(driver);
		sign.signUpDetails();
	
		
		driver.quit();
	
	
}
}