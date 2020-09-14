package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PomCreateDetailspage {

	@FindBy(xpath="//a[.='Create Profile']")
	 private WebElement createDetailButton;
	
	
	@FindBy(xpath="(//input[@type='text'])[1]")
	 private WebElement profileHandleText;
	
	@FindBy(xpath="//select[@name='status']")
	 private WebElement proffesionalDropDown;
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	 private WebElement companyTextBox;
	
	@FindBy(xpath="(//input[@type='text'])[3]")
	 private WebElement websiteTextBox;
	
	@FindBy(xpath="(//input[@type='text'])[4]")
	 private WebElement locationTextBox;
	
	@FindBy(xpath="(//input[@type='text'])[5]")
	 private WebElement skillsTextbox;
	
	@FindBy(xpath="//*[@id='root']/div/div/div/div/div/div/div[2]/form/div[8]/textarea")
	 private WebElement textAreaBox;
	
	//input[@type='submit']
	
	@FindBy(xpath="//input[@type='submit']")
	 private WebElement submitButtonCreatedetailspage;
	
	
	public PomCreateDetailspage(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
		
	}

	public void createDetails()
	{
		
		createDetailButton.click();
		profileHandleText.sendKeys("rkj rout");
		
		Select sel=new Select(proffesionalDropDown);
		sel.selectByVisibleText("QA / Tester");
		companyTextBox.sendKeys("bcdef");
		websiteTextBox.sendKeys("www.bchdjk.com");
		locationTextBox.sendKeys("bbsr");
		skillsTextbox.sendKeys("software tester");
		textAreaBox.sendKeys("i am very passionate about my work");
		
		submitButtonCreatedetailspage.click();
		
		
		
		
		
		
		
		
		
		
		
	}
	
}

