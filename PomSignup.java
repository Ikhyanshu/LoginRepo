package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomSignup
{

	
	
	@FindBy(xpath="(//a[.='Sign Up'])[2]")
	 private WebElement clickSignUp;
	
	
	@FindBy(xpath="//input[@type='text']")
	 private WebElement signUPName;
	
	@FindBy(xpath="//input[@type='email']")
	 private WebElement emailSignUP;
	
	@FindBy(xpath="(//input[@type='password'])[1]")
	 private WebElement passwordSignUP;

	
	@FindBy(xpath="(//input[@type='password'])[2]")
	 private WebElement verifyPasswordSignUP;
	
	@FindBy(xpath="//input[@type='submit']")
	 private WebElement submitButton;


	public  PomSignup(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void signUpDetails()
	{
		clickSignUp.click();
		signUPName.sendKeys("ikhyanshu");
		emailSignUP.sendKeys("ikhyanshu@gmail.com");
		passwordSignUP.sendKeys("ikhy123");
		verifyPasswordSignUP.sendKeys("ikhy123");
		submitButton.click();
		
		
		
		
	}
	
	
}

