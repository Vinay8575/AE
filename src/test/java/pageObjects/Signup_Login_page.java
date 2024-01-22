package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Signup_Login_page extends BasePage
{
	public Signup_Login_page(WebDriver driver)
	{
		super(driver);
	}
	
	//locators
	@FindBy(xpath="//input[@data-qa='signup-name']") WebElement txt_signupname;
	@FindBy(xpath="//form[@action='/signup']//*[@placeholder='Email Address']") WebElement txt_signupemail;
	//@FindBy(xpath="//input[@data-qa='signup-email']") WebElement emailAddress;
	@FindBy(xpath="//button[@data-qa='signup-button']") WebElement btn_signup;
	
	//ActionMethods
	public void setsignupname(String name)
	{
		txt_signupname.sendKeys(name);
	}
	
	public void setsignupemail(String email)
	{
		txt_signupemail.sendKeys(email);
	}
	
	public void clicksignup()
	{
		btn_signup.click();
	}

}
