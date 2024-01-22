package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
	public HomePage(WebDriver driver) {
		super(driver);
	}

	// locators
	@FindBy(xpath = "//a[text()=' Signup / Login']") WebElement lnksignup_login;
	//@FindBy(xpath = " //a[text()=' Logout']") WebElement lnk_logout;

	@FindBy(xpath = "//input[@data-qa='login-email']") WebElement login_emailAddress;
	@FindBy(xpath = "//input[@placeholder='Password']") WebElement login_password;
	@FindBy(xpath = "//button[normalize-space()='Login']") WebElement login;

	// Action_Methods

	public void clicksignup_login() {
		lnksignup_login.click();
	}

	/*public void click_logout() {
		lnk_logout.click();
	}*/
	
	public void setemail(String email)
	{
		login_emailAddress.sendKeys(email);
	}
	
	public void setpassword(String pwd)
	{
		login_password.sendKeys(pwd);
	}
	
	public void clicklogin()
	{
		login.click();
	}

}
