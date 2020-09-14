package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomLogin {

	
	
	@FindBy(xpath="//a[.='Login']")
	public WebElement loginButton;
	
	
	@FindBy(xpath="//input[@type='email']")
	public WebElement emailLogin;
	
	@FindBy(xpath="//input[@type='password']")
	public WebElement passswordLogin;
	
	
	@FindBy(xpath="//input[@type='submit']")
	public WebElement submitLogin;
	
	public PomLogin(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
	}
	
	
	public void loginDetails(){
		
		
		loginButton.click();
		emailLogin.sendKeys("ikhyanshu@gmail.com");
		passswordLogin.sendKeys("ikhy123");
		submitLogin.click();
	}
	
	
	
}
