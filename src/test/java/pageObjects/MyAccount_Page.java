package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccount_Page extends BasePage
{
	public MyAccount_Page(WebDriver driver)
	{
		super(driver);
	}
	
	//locating elements
	
	@FindBy(xpath = " //a[text()=' Delete Account']") WebElement lnk_delete;
	@FindBy(xpath = " //a[text()=' Logout']") WebElement lnk_logout;
	
	//Action methods
	
	public boolean verify_delete()
	{
		boolean value=lnk_delete.isDisplayed();
		return value;
	}
	
	public void click_logout() {
		lnk_logout.click();
	}

}
