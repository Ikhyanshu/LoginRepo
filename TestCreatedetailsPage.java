package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import Pom.PomCreateDetailspage;
import Pom.PomLogin;

public class TestCreatedetailsPage {

	
	@Test(priority=3)
	public void  loginDetails()
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.developer-connector-mern.com/");
		
		
		PomLogin login=new PomLogin(driver);
		login.loginDetails();
		
		PomCreateDetailspage createDetailspage=new PomCreateDetailspage(driver);
		createDetailspage.createDetails();
		
		driver.quit();
	
	
	}
	
}
