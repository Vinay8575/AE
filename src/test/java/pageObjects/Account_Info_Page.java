package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Account_Info_Page extends BasePage
{
	public Account_Info_Page(WebDriver driver) {
		super(driver);
	}

	// locators

	@FindBy(xpath = "//input[@id='id_gender1']")
	WebElement rd_mr;
	@FindBy(id = "name")
	WebElement txt_name;
	@FindBy(id = "password")
	WebElement txt_password;

	@FindBy(id = "days")
	WebElement drp_days;
	@FindBy(id = "months")
	WebElement drp_months;
	@FindBy(id = "years")
	WebElement drp_years;

	@FindBy(id = "newsletter")
	WebElement rd_signupnewsletter;

	@FindBy(xpath = "//input[@id='first_name']")
	WebElement firstName;
	@FindBy(xpath = "//input[@id='last_name']")
	WebElement lastName;
	@FindBy(xpath = "//input[@id='company']")
	WebElement company;
	@FindBy(xpath = "//input[@id='address1']")
	WebElement address1;
	@FindBy(xpath = "//input[@id='address2']")
	WebElement address2;
	@FindBy(id = "country")
	WebElement drp_country;
	@FindBy(xpath = "//input[@id='state']")
	WebElement state;
	@FindBy(xpath = "//input[@id='city']")
	WebElement city;
	@FindBy(xpath = "//input[@id='zipcode']")
	WebElement zipcode;
	@FindBy(xpath = "//input[@id='mobile_number']")
	WebElement mobileNumber;
	@FindBy(xpath = "//button[normalize-space()='Create Account']")
	WebElement createAccount;
	@FindBy(xpath = "//p[text()='Congratulations! Your new account has been successfully created!']")
	WebElement message;
	@FindBy(xpath = "//a[text()='Continue']")
	WebElement txt_continue;
	

//ActionsMethod

	public void clicktitle() 
	{
		rd_mr.click();
	}
	
	public void setname(String name)
	{
		txt_name.sendKeys(name);
	}
	
	public void setpassword(String pwd)
	{
		txt_password.sendKeys(pwd);
	}
	
	public WebElement drp_dayy()
	{
		return drp_days;
	}
	
	public WebElement drp_monthss()
	{
		return drp_months;
	}
	
	public WebElement drp_yearss()
	{
		return drp_years;
	}
	
	
	public void clicknewspaper() 
	{
		rd_signupnewsletter.click();
	}
	
	public void setfirstname(String fname)
	{
		firstName.sendKeys(fname);
	}
	
	public void setlastname(String lname)
	{
		lastName.sendKeys(lname);
	}
	
	public void setcompanyname(String cname)
	{
		company.sendKeys(cname);
	}
	
	public void setaddress1(String aaddress1)
	{
		address1.sendKeys(aaddress1);
	}
	
	public void setaddress2(String aaddress2)
	{
		address2.sendKeys(aaddress2);
	}
	
	public WebElement setcountryy()
	{
		return drp_country;
	}
	
	public void setstate(String statee)
	{
		state.sendKeys(statee);
	}
	
	public void setcity (String cityy)
	{
		city.sendKeys(cityy);
	}
	
	public void setzipcode (String code)
	{
		zipcode.sendKeys(code);
	}
	
	public void setmobilenumber (String mnumber)
	{
		mobileNumber.sendKeys(mnumber);
	}
	
	public void click_CreateAccount()
	{
		createAccount.click();
	}
	
	public String verifymessage()
	{
		String text=message.getText();
		return text;
	}
	
	public void click_continue()
	{
		txt_continue.click();
	}

}
