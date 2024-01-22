package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.MyAccount_Page;
import testBase.BaseClass;
import utilities.DataProviders;

public class TC_003_LoginDataDrivenTest extends BaseClass
{
	@Test(dataProvider="LoginData",dataProviderClass=DataProviders.class,groups= {"master"})
	void testLoginDataDriven(String name, String pwd, String res)
	{
		logger.info("********* Started TC_003_LoginDataDrivenTest*****************");
		try {
		HomePage hp=new HomePage(driver);
		hp.clicksignup_login();
		
		hp.setemail(name);
		hp.setpassword(pwd);
		hp.clicklogin();
		
		MyAccount_Page mp=new MyAccount_Page(driver);
		boolean status=mp.verify_delete();
		
		if(res.equalsIgnoreCase("Valid"))
		{
			if(status==true)
			{   
				mp.click_logout();
				Assert.assertTrue(true);
			}
			else
			{
				Assert.fail();
			}
		}
		
		if(res.equalsIgnoreCase("Invalid"))
		{
			if(status==true)
			{
				mp.click_logout();
				Assert.fail();
			}
			else
			{
				Assert.assertTrue(true);
			}
		}
		}
		catch(Exception e)
		{
			logger.error("Exception handled");
			logger.debug("Debug appliaction log");
			Assert.fail();
		}
		
		
	}
}
