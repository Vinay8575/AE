package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.MyAccount_Page;
import testBase.BaseClass;

public class TC_002_LoginTest extends BaseClass
{
	
	@Test(groups= {"sanity"})
	void testlogin()
	{
		HomePage hp=new HomePage(driver);
		hp.clicksignup_login();
		hp.setemail(p.getProperty("email"));
		hp.setpassword(p.getProperty("password"));
		hp.clicklogin();
		
		MyAccount_Page mp=new MyAccount_Page(driver);
		boolean value=mp.verify_delete();
		Assert.assertEquals(value, true);
		mp.click_logout();
		
		
	}

}
