package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import Pom.PomLogin;
import Pom.PomLogout;

public class TestLogout {

	
	@Test(priority=2)
	public void  loginDetails()
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.developer-connector-mern.com/");
		
		
		PomLogin login=new PomLogin(driver);
		login.loginDetails();
		
		PomLogout logout=new PomLogout(driver);
		logout.logoutDetails();
}
}
