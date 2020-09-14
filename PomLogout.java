package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomLogout {

	
	
	
	@FindBy(xpath="//*[@id='navbar__logout-li']")
	public WebElement logoutButton;
	
	
	public PomLogout(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	public void logoutDetails(){
		
		
		logoutButton.click();
	}
}
